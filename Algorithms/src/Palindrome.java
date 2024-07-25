public class Palindrome {
    
    public static void main(String[] args){

        String x = "abcdcba";

        int i = 0, j= x.length() - 1;

        while(i<j){
            if(x.charAt(i) != x.charAt(j)){
                System.out.println("Not Palindromo");
                System.exit(0);
            }
            i++;
            j--;
        }
         System.out.println("Palindromo");
         palCom();
    }

    public static void palCom(){

        String str = "levEl";
        String reverString = "";

        for(int i=str.length()-1; i>=0; i--){
            reverString+= str.charAt(i);
        }

        if(str.equalsIgnoreCase(reverString)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
