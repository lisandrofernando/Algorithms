import java.util.Arrays;

public class BubbleSort {
    
    /*
    * The bubble sort array will organize the array in order from the smallest value to the highest value
    * The outer loop will run until n operations
    * The inner loop will run until n-1 or n-i
    */

  public static void main(String[] args) {

    int arr[] = {6,9,3,2,10,1};
    int temp;

    for(int i=0; i<arr.length; i++){

        for(int j=1; j<arr.length-i; j++){

            //If the second index number is bigger than the previous then swich indexes
            if(arr[j] < arr[j-1]){
                  temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
  }
}
