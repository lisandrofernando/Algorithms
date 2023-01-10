public class BinarySearch {
    
    public static void main(String [] args) {
        
        int arr [] = {1,2,3,4,5,6};
        System.out.println(Search(arr, 4));
    }

    public static int Search(int [] arr, int target) {
        int left = 0, right = arr.length; int middle;
        while(left<=right)
        {
            middle = (left + right)/2;
            if(arr[middle]==target)
            return middle;

            if(arr[middle]> target)
                right = middle -1;
            else
                left = middle +1;
        }
        return -1;
    }
}
