package Arrays;


public class StockBuyAndSell {
    //Brute force approach - checks all the future selling prices and sees which gives the best profit
    public static int StockBuySell(int[] arr){
        int maxProfit = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;

    }

    //Optimal approach - we will do a single traversal and keep track of minimum price and maximum profit

    public static int StockBuyAndSellOptimal(int[] arr){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i = 0;i<n;i++){
            // arr[i] is the current/today's price we are checking
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
            //if current price is greater than minPrice , then we will check profit
            else{
                int profit = arr[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] arr = {7, 1, 5, 3, 6, 4};
        StockBuyAndSell obj = new StockBuyAndSell();
        int result = obj.StockBuySell(arr);
        int result1 = obj.StockBuyAndSellOptimal(arr);
        System.out.println("The max profit is " + result);
        System.out.println("The max profit is " + result1);
    }
    
}
