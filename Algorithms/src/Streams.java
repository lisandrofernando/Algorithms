import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    
    public static void main(String[] args) {
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
    }

    public static void anotherStream() {
        
        Stream.of(2,5,8,12,14,18,22).forEach(d->System.out.println(d));
    }

    public static void Map() {
        
        Stream.of("John", "Natcho", "Doug", "Prince","nina", "emma").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        List<String> names =   Arrays.asList("John", "Natcho", "Doug", "Prince","nina", "emma");
        names.stream().sorted().forEach(a->System.out.println(a));
        List<String> listNames=   Arrays.asList("Leo", "Drake", "Brian", "steve");
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
}
