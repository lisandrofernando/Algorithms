public class PrintRows {

    public static void main(String[] args) {
        int rows = 5;
        int n =3;
        

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println("");
        }

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i*n);
                System.out.print("\t");
                
            }
            System.out.println("");
        }
        for (int i=1; i<=rows; i++){
            for(int j=1, p=1; j<=i; j++, p++){
             System.out.print(p+"");
             System.out.print("\t");
            }
            System.out.println("");
        }
    }

}
