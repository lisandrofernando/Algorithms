public class LinearSearch {
    
    public static void main(String[] args) {
        
        int [] arr = {2,7,11,33,12};
       
        System.out.println(Search(arr, 12));
    }

    public static int Search(int[] arr, int target) {
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target)
                  return i;
        }
        return -1;
    }
}
