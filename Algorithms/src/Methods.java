import java.util.ArrayList;
import java.util.List;
//Creating a constructor for methods class, which accepts arguments.
public class Methods {
    
    String name;
    String address;
    String state;


     Methods(String name, String address, String state){
        this.name = name;
        this.address = address;
        this.state = state;

    }

    public void getData(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(state);
    }



    public static int Math(){
        return 0;
        
    }

    int myMthd(){
        return 0;
    }

    public int mathMth(){
        return 0;

    }

    public String myStr(){
        return null;
        
    }

    public boolean Meth(){
        return true;
    }

    long bigMeth(){
        return 0;
    }

    public double largeNum(){
        return 888.99999;
    }

    public float extraLarge(){
        return (float) 9999.99999;
    }

    public char myLetter(){
        return 0;
        
    }

    public static String newString(String k){
        return k;
    }



    public static void main(String[] args){
        
        Methods method = new Methods("Carlos","San Pedro","Nuevo Leon");
        Methods method1 = new Methods("Jose","Houston","Texas");
        //System.out.println(method);
        method.getData();
        method1.getData();
        flag();
        weig(8);
        bonus(8);
    }

    public int multipleMethods(int num, int todouble){
        int count = 0;

        return count;

    }

    //  public  List<Integer, String>(){
    // }

    private static boolean flag(){

        boolean flagi = true;
      
      if(flagi){
        System.out.println("great");
      }
      else if(flagi){
        System.out.println("great great");
      }
    return flagi;
    }

    public static int weig(int x){
       int result =  x * 30;
       System.out.println(result);
        return result;
    }

    public static int bonus(int y){
        int result =  weig(8) + 50;
        System.out.println(result);
        return result;
    }
    
}
