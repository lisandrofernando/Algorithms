public class BasicCalculator {
    
public BasicCalculator(){

}

public int add(int x, int y){

    return x+y;
}

public int subtract(int x, int y){

    return x-y;
}

public int multiply(int x, int y){

    return x*y;
}

public int devide(int x, int y){

    return x/y;
}


    public static void main(String[] args ) {
        
        BasicCalculator calc = new BasicCalculator();
        System.out.println(calc.add(31, 78));
        System.out.println(calc.subtract(78, 33));
        System.out.println(calc.devide(130, 78));
        System.out.println(calc.multiply(31, 78));
    }
}
