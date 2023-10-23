public class ArrayProfit {
    

    public static void main(String[] args){
        int prices[] = {60, 40, 100, 200, 20, 150};
        System.out.println("Max profit is" + getMaxProfit(prices));

    }

    public static int getMaxProfit(int prices[]){
        if (prices.length < 2){
            return 0;
        }

        int minPrice = prices[0];
        int profit = 0;
         for(int i=1; i<prices.length; i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }
            int potentialProfit =  prices[i]-minPrice;
            if(potentialProfit > profit){
                profit = potentialProfit;
            }
         }
          return profit;
        
    }
}
