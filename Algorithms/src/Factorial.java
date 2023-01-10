public class Factorial {

    public static void main(String[] args) {

        int value = Fact(5);
        System.out.println(value);
    }

    private static int Fact(int i) {
        if (i == 1)

            return 1;
        return i * Fact(i - 1);
    }
}
