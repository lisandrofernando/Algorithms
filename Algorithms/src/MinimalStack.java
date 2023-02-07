import java.util.Stack;

public class MinimalStack {
    
static Stack<Integer> mainStack = new Stack<Integer>();
static Stack<Integer> temp = new Stack<Integer>();
    public static void main(String[] args) {
        customPush(14);
        customPush(2);
        customPush(7);
        customPush(4);
        customPush(12);
        System.out.println(temp.peek() +" is the minimum element in the stack");

    }
    private static void customPush(int i) {
         mainStack.push(i);
         if(temp.isEmpty())
         temp.push(i);

         else if(temp.peek()>i)
         temp.push(i);
    }

    private static void customPop() {
        int item = mainStack.peek();
        mainStack.pop();
        if(temp.peek() ==item)
        temp.pop();
   }

}
