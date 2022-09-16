class Solution {
    //Tabulation dp
     public int maxProfit(int[] prices){
 int[][][] dp = new int[prices.length+1][2][3];
//         for(int[][] row : dp){
//             for(int[] col : row){
//                 Arrays.fill(col, 0);
//             }
             
//         }
         
         for(int ind = prices.length-1;ind >=0; ind--){
             for(int buy = 0;buy <= 1;buy++){
                 for(int k = 1;k <= 2; k++){
                             if(buy == 1){
                   dp[ind][buy][k]  = Math.max(-prices[ind] + dp[ind+1][0][k],  0 + dp[ind+1][1][k]);
                }else{
                     dp[ind][buy][k]  = Math.max(prices[ind] + dp[ind+1][1][k-1], 0 + dp[ind+1][0][k]);
                     }
                 }
             }
         }
         
         return dp[0][1][2];
         
         
     }
         
         
    
    //Memoization dp 
//      public int maxProfit(int[] prices) {
//         int[][][] dp = new int[prices.length][2][3];
//         for(int[][] row : dp){
//             for(int[] col : row){
//                 Arrays.fill(col, -1);
//             }
             
//         }
       
//         int res = helper(prices,dp,0,1, 2);
//         return res;
//     }
    
//     public int helper(int[] prices,int[][][] dp, int ind, int buy, int k){
//         if(prices.length == ind || k <= 0) return 0;
//         int profit=0;
//         if(dp[ind][buy][k] != -1) return dp[ind][buy][k];
//         if(buy == 1){
//            profit  = Math.max(-prices[ind] + helper(prices,dp,ind+1,0, k),  0 + helper(prices,dp,ind+1,1,k));
//         }else{
//              profit  = Math.max(prices[ind] + helper(prices,dp,ind+1,1,k-1) , 0 + helper(prices,dp,ind+1,0,k));
           
//         }
//         dp[ind][buy][k] = profit;
//         return profit;
        
//     }
}