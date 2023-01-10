public class Calc {
    
    public static void main(String [] args) {
        int AddMethod = add(20, 7);
        System.out.println(AddMethod);
        int SubMethod = subtract(9, 4);
        System.out.println(SubMethod);
        int MultiMethod = multiply(74, 8);
        System.out.println(MultiMethod);
        int DevidMethod = devide(9,3);
        System.out.println(DevidMethod);
    }

    private static int add(int x, int y){
        return x+y;
    }

    private static int subtract(int x, int y){
        return x-y;
    }

    private static int multiply(int x, int y){
        return x*y;
    }

    private static int devide(int x, int y){
        return x/y;
    }
}
