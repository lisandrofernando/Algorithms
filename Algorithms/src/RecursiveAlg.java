
public class RecursiveAlg {

    /* In this exercise pay careful attention in the number of digits which in this case is i */
    static int[] myArray = { 12, 9, 13, 86, 42 };
    static int sum = 0;
    static  int arr = 0;
    public static void main(String[] args) throws Exception {

        int value = someOf(myArray.length - 1);
        System.out.println(value);
        ArraySum(myArray);
    }

    private static int someOf(int i) {

        if (i == 0)
            return myArray[i];

        return myArray[i] + someOf(i - 1);

    }

    public static int ArraySum(int arr[]){

          for(int i=0; i<myArray.length; i++){

            int result = sum + myArray[i];

            System.out.println(result);

    }

     return arr[0];
    }
  

}
