import java.util.Arrays;

public class SelectionSort {

    /*
    * The second loop is to find the minimal element and switch by the biggest element
    * The minIndex will be increasing because it is monitoring the i index
     */

public static void main(String[] args) {
   
       int arr[] = {4,8,2,0,9,1,24};
       int temp;
       int minIndex;

       for(int  i=0; i<arr.length; i++){
            minIndex = i;

            for(int j=i; j<arr.length; j++){

                if(arr[j]<arr[minIndex]){
                    temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                }
            }


       }
       System.out.println(Arrays.toString(arr));
}

}
