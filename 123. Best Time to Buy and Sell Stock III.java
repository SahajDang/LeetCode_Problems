// class Solution {
//     public int maxProfit(int[] prices) {
        // int n = prices.length;
        // if (n == 0) return 0;
        
        // int[][] dp = new int[3][n];
        
        // for (int t = 1; t <= 2; t++) {
        //     int maxDiff = -prices[0];
        //     for (int d = 1; d < n; d++) {
        //         dp[t][d] = Math.max(dp[t][d-1], prices[d] + maxDiff);
        //         maxDiff = Math.max(maxDiff, dp[t-1][d] - prices[d]);
        //     }
        // }
        // return dp[2][n-1];

class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;

        for (int price : prices) {
            buy1 = Math.max(buy1, -price);             
            sell1 = Math.max(sell1, buy1 + price);     
            buy2 = Math.max(buy2, sell1 - price);      
            sell2 = Math.max(sell2, buy2 + price);    
        }

        return sell2;
    }
}
