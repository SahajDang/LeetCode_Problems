class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // int lowestPrice = prices[0];
        // for(int i = 1; i < prices.length; i++){
        //     if(prices[i] > lowestPrice){
        //         int profit = prices[i] - lowestPrice;
        //         maxProfit = Math.max(profit, maxProfit);
        //     }
        //     lowestPrice = Math.min(lowestPrice, prices[i]);
        // }
        // return maxProfit;
        for(int i = 1; i < prices.length; i++){
                if(prices[i] > prices[i - 1]){
                    maxProfit += prices[i] - prices[i - 1]; 
            }
        }
        return maxProfit;
    }
}
