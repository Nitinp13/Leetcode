class Solution {
    
     public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];
        for(int[][] row : dp){
            for(int[] col : row){
                Arrays.fill(col, -1);
            }
             
        }
       
        int res = helper(prices,dp,0,1, 2);
        return res;
    }
    
    public int helper(int[] prices,int[][][] dp, int ind, int buy, int k){
        if(prices.length == ind || k <= 0) return 0;
        int profit=0;
        if(dp[ind][buy][k] != -1) return dp[ind][buy][k];
        if(buy == 1){
           profit  = Math.max(-prices[ind] + helper(prices,dp,ind+1,0, k),  0 + helper(prices,dp,ind+1,1,k));
        }else{
             profit  = Math.max(prices[ind] + helper(prices,dp,ind+1,1,k-1) , 0 + helper(prices,dp,ind+1,0,k));
           
        }
        dp[ind][buy][k] = profit;
        return profit;
        
    }
}