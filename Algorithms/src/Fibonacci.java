
public class Fibonacci {

    public static void main(String[] args) {

        int value = Fibo(9);
        System.out.println(value);
    }

    private static int Fibo(int i) {

        if (i == 0 || i == 1) {
            return i;
        }
        return Fibo(i - 1) + Fibo(i - 2);
    }
}
