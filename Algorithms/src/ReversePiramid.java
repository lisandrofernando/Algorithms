public class ReversePiramid {

    public static void main(String[] args) {
        int number = 7;
        int s = number, j;

        while (s > 0) {
            j = 0;

            while (j++ < number - 1) {
                System.out.print(" ");
            }
            j = 0;

            while (j++ < (s * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();

            s--;
        }

    }
}
