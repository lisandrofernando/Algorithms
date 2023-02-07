import java.util.Stack;

public class QueueStack {
    /* The stack algoriths work last in first out. Some of the fundamental methods are push, pop, isEmpty,isfull, Peek*/

    static Stack<Integer> stack = new Stack<Integer>();

    Stack<Integer> stack1 = new Stack<Integer>();

    

    public void Enqueue(int x){
        stack.push(x);
    }

    public int Dequeue(){
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }

        int ele = stack1.pop();

        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
        return ele;
    }

    public static void main(String[] args) {
        
        QueueStack queue = new QueueStack();
        queue.Enqueue(3);
        queue.Enqueue(8);
        queue.Enqueue(11);
        queue.Enqueue(14);
        System.out.println(stack.peek());
        queue.Dequeue();
        System.out.println(stack);

        Stack<Integer> stack2 = new Stack<Integer>();
        stack2.push(12);
        stack2.push(3);
        stack2.push(8);
        stack2.push(1);
        System.out.println(stack2);
        System.out.println(stack2.peek());

    }
}
