public class BinarySearchRecursion {
    
    public static void main(String [] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Search(arr, 6, 0, arr.length-1));
    }

    public static int Search(int [] arr, int target, int left, int right) {
        
        if(right < left)
        return -1;

        int middle = (left + right)/2;

        if(arr[middle]==target)
        return middle;

        if (arr[middle]> target){
            right = middle - 1;
            return Search(arr, target, left, right); 
        }
        else {
            left = middle +1;
            return Search(arr, target, left, right);
        }
    }
}
