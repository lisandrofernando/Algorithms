import java.util.Stack;

public class StackAlgo {
    
public static void main(String[] args) {
    String s = "(2+) [{4}]";
     System.out.println(isBalanced(s));
}

private static boolean isBalanced( String s) {
       
          Stack stak = new Stack();

          for( char c: s.toCharArray())
          {
            if(c== '(' || c =='{' || c=='['){
                stak.push(c);
            
                if (c==')' || c =='}' || c ==']'){

                Character top = (char) stak.pop();
                if ((top == '(' && c !=')') || (top == '{' && c !='}') || (top == '[' && c !=']')){
                return false;
                }
          }
        }
    }
     return stak.isEmpty();
    }
  
}
