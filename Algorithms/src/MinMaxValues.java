public class MinMaxValues {
    /*
     * This is a linear search algorithm
     */

    public static void main(String[] args) {
        int myArr[]={2,7,9,1,98,12,13};
        int min=myArr[0];
        int max=myArr[0];
        for(int i=0; i<myArr.length; i++){
            System.out.println(myArr[i]);
          
            if(myArr[i]<min){
            min = myArr[i];
                
            }
            else if(myArr[i]>max){
                max = myArr[i];
                
            }
        }
        System.out.println("The max number is:"+ max);
        System.out.println( "The minimum number is:"+ min);
    }
}
