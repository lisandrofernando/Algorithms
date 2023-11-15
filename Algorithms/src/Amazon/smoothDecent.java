package Amazon;

public class smoothDecent {
    
    public static void main(String [] args){

    }
    public long getDecentPeriod(int prices []){
        int start = 0;
        int end = 0;
        long ans = 1;
        for(end = 1; end<prices.length; end++){
            if(prices[end] == prices[end-1] -1){
                        ans += end - start +1;
            }
           
         else {
            start = end;
            ans += end - start + 1;
        }
       
    }
     return ans;
    }
}
