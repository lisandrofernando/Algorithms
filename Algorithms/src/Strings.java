import java.time.Year;

public class Strings {
    
  public static void main(String[] args) {
    
    String myString = "Merry Christmas";
    System.out.println(myString.length());
    System.out.println(myString.substring(3, 9));

    String a ="Happy";
    String b = "New Year";
    System.out.println(a.charAt(3));
    System.out.println(b.indexOf("Year", 2));
     
    if(a.equals(b)){
        System.out.println("We good");
    }
    else if(!a.equals(b)){
        System.out.println("we ain't same");
    }
  }
}
