public class MultidimensionalArray {
    
    public static void main(String[] args) {
        
        int a[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int min=a[0][0];
        int max=a[0][0];

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.println(a[i][j]);
                if(a[i][j]<min){
                    min = a[i][j];
                }
                else if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("The minimum number is:" +min);
        System.out.println("The minimum number is:" +max);
    }
}
