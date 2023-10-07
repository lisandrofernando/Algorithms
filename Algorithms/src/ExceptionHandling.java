public class ExceptionHandling {

    /* The try catch block means the script will not fail imidiatelly once an error occurs
       one try block should be followed by multiple catch blocks
       There are multiple types of exceptions for example: Arithemetic exception, Exception e generic 
       The finally block will be executed irrespective the exception is thrown or not and should be returned only when we use the try block */


    public static void main(String[] args){

        int a = 8;
        int b = 0;

        try {
          int  d = a/b;
          System.out.println(d);
        } catch (Exception e) {
           System.out.println(" I catched an error");
        }

    }
    
}
