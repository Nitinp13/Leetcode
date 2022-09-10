class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];
        for(int[] row : dp){
             Arrays.fill(row, -1);
        }
       
        int res = helper(prices,dp,0,1);
        return res;
    }
    
    public int helper(int[] prices,int[][] dp, int ind, int buy){
        if(prices.length == ind) return 0;
        int profit=0;
        if(dp[ind][buy] != -1) return dp[ind][buy];
        if(buy == 1){
           profit  = Math.max(-prices[ind] + helper(prices,dp,ind+1,0),  0 + helper(prices,dp,ind+1,1));
        }else{
             profit  = Math.max(prices[ind] + helper(prices,dp,ind+1,1) , 0 + helper(prices,dp,ind+1,0));
           
        }
        dp[ind][buy] = profit;
        return profit;
        
    }
}