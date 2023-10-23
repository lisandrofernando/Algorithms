import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    
    public static void main(String[] args) {


        /* Streams in java start with source code followed by an intermidiate, 
        or multiple intermidiate operation operations and by a terminal operation.
        Stream source can be create from Collections, Lists, Sets, ints, longs, doubles, arrays and more
        Intermidiate operations such as filters, maps, sort, return a stream
        Terminal operations such as forEach, Collect, reduce are either void or return a non stream 
        Some Itermidiate operators such as anyMatch,distinct, filter, findFirst, flatMap, map, skip,sorted.
        Some terminal operations such as count, max, min, reduce, summaryStatistics, forEach, and reduce.
        */

        int  count = 0;

        ArrayList<String> name = new ArrayList<String>();
        name.add("Jake");
        name.add("Jay");
        name.add("John");
        name.add("michel");
        
        name.stream();

        // for(int i=0; i<name.size(); i++){
        //     String actual = name.get(i);
        //     if(actual.startsWith("J")){
        //         count ++;
        //     }
        // }
        // System.out.println(count);

        System.out.println(name.stream().filter(s->s.startsWith("J")).count());
        //Long d = name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
        name.stream().forEach(a->System.out.println(a));
        anotherStream();
        Map();
        Collect();
        thirdHighestValue();
        Stacks();
    }

    public static void anotherStream() {
        
      Stream.of(2,5,8,12,14,18,22).forEach(d->System.out.println(d));
      Stream.of(1,1,2,4,4,5,6,6,7,7).distinct().sorted().forEach(b->System.out.println("The unique value is:"+ b));
      Stream.of(18,28,39,45,55,66,78,89,92,130).max(Comparator.comparing(Integer::intValue)).ifPresent(num->System.out.println("The max value is:"+num));
      Stream.of(18,28,39,45,55,66,78,89,92,130).min(Comparator.comparing(Integer::intValue)).ifPresent(num->System.out.println("The min value is:"+num));
    }

    public static void Map() {
        
        Stream.of("John", "Natcho", "Doug", "Prince","nina", "emma").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println("Here"+s));

        List<String> names =   Arrays.asList("John", "Natcho", "Doug", "Prince","Nina", "Emma");
        names.stream().sorted().forEach(a->System.out.print(a));
        List<String> listNames=   Arrays.asList("Leo", "Drake", "Brian", "Steve");
        Stream<String>  newStream =  Stream.concat(names.stream(), listNames.stream());
        newStream.sorted().forEach(a->System.out.println(a));
        // boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("abdsc"));
    }  

    public static void Collect() {
      List<String> ls = Stream.of("John", "Natcho", "Doug", "Prince","nina", "emma").collect(Collectors.toList());
      System.out.println(ls.get(0));

       List<Integer> values = Arrays.asList(1,1,3,4,4,5,6,8,8,12,12);
       values.stream().distinct().forEach(n->System.out.println(n));
       
       List<Integer> val =   values.stream().distinct().sorted().collect(Collectors.toList());
       System.out.println(val.get(3));
    }

    public static void thirdHighestValue(){

        Integer arr[] = {2,5,8,12,14,24};

        List<Integer> list = Arrays.asList(arr);
        list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(a->System.out.println("The third highest value is:"+a));

        List<Integer> numbers = Arrays.asList(11,2,3,45,67,9,90,87,8,12);

       List<Integer> evenNum = numbers.stream().filter(e-> e%2==0).collect(Collectors.toList());
       System.out.println(evenNum);

    }

    public static void Stacks(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(21);
        stack.push(68);
        stack.push(99);
        System.out.println(stack);
        stack.insertElementAt(44,2);
        System.out.println(stack);
        
     inserInTheMidle(3,35,stack);
       System.out.println(stack);
    }

    private static void inserInTheMidle(int index, int value, Stack<Integer>s) {
        Stack<Integer> temp = new Stack<Integer>();
        for(int i=1; i<=s.size()-index+1; i++){
            int item = s.peek();
            temp.push(item);
            s.pop();
        }
        s.push(value);
        while(!temp.empty()){
            int item = temp.peek();
            s.push(item);
             temp.pop();
        }
    }
}
