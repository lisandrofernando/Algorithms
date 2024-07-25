public class SumOfDigits {
    
    public static void main(String[] args){
        String str = "A1B2C3D4";

        int Total = 0;

        for(int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
             if(Character.isDigit(ch)){
                Total += Integer.parseInt(""+ch);
             }
              
        }

       System.out.println(Total);
    }
}
