
public class App {

    static int[] myArray = { 12, 9, 13, 86, 42 };

    public static void main(String[] args) throws Exception {

        int value = someOf(myArray.length - 1);
        System.out.println(value);
    }

    private static int someOf(int i) {

        if (i == 0)
            return myArray[i];

        return myArray[i] + someOf(i - 1);

    }
}
