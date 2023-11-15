package Amazon;

import java.util.Scanner;

public class practice {

    public static void main(String[] args){

        int n = 4;
        if(n%2!=0){
            System.out.println("Weird");
        }
        if(n >= 2 && n <=5){
            System.out.println("Not weird");
        }
        if(n>= 6 && n<=20){
            System.out.println("weird");
        }
        if(n>20){
            System.out.println("Not Weird");
        }
    }
    
}
