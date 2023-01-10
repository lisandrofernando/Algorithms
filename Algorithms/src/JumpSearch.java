public class JumpSearch {
    
    public static void main(String[] args) {

        int arr [] = {6,12,45,33,9,11,2,15,8, 16, 10};
        System.out.println(JumpSearch(arr, 16));
    }

    public static int JumpSearch(int [] arr, int target) {
        
        int blocksize = (int) Math.sqrt(arr.length);
        System.out.println(blocksize);
        int start = 0;
        int last = blocksize-1;
        while(arr[last]<target && start < arr.length){
            start = last +1;
            last = last + blocksize;
            if(last>arr.length-1)
            last = arr.length -1;
        }
        for(int i = start; i<=last; i++){
            if(arr[i]== target)
            return i;
        }
        return -1;
    }
}
