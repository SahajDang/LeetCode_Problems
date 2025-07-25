class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        
        int[][] dp = new int[k + 1][n];
        
        for (int t = 1; t <= k; t++) {
            int maxDiff = -prices[0];
            for (int d = 1; d < n; d++) {
                dp[t][d] = Math.max(dp[t][d-1], prices[d] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t-1][d] - prices[d]);
            }
        }
        return dp[k][n-1];
    }
}
