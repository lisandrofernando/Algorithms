import java.util.Stack;


/*The push method will add a new value in the stack, pop will delete, peek will print the last value */
public class ReverseStack {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        stack.push(12);
        stack.push(8);
        stack.push(3);
        stack.push(10);
        stack.push(15);
        System.out.println(stack.peek());
        System.out.println(stack);
        moveStack(stack, stack1);
        moveStack(stack1, stack2);
        moveStack(stack2, stack);
        System.out.println(stack);
        System.out.println(sortedStack(stack));
    }

    private static Stack<Integer> sortedStack(Stack<Integer> stac) {

        Stack<Integer> tempstk = new Stack<Integer>();

        while(!stac.isEmpty()){
            int temp = stac.pop();
                while(!tempstk.isEmpty() && tempstk.peek()>temp  ){
                    int tem = tempstk.pop();
                    stac.push(tem);
              }
              tempstk.push(temp);
        }
        return tempstk;
    }

    private static void moveStack(Stack<Integer> source, Stack<Integer> dest) {

        while(!source.isEmpty()){

            int item = source.peek();
            dest.push(item);
            source.pop();
        }
      

    }
}
