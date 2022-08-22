class Solution {
      // Tabulation with Space Optimization 1 ms  (Bottom - Up Approach) 
    // TC -> O(N)   SC - > O(1) 
    public int rob(int[] a) {
         int[] dp = new int[a.length];
         Arrays.fill(dp, -1);
        
         int prev = a[0];
        int prev2 = 0;
        int n = a.length;
        if(n < 2) return a[0];
        
        for(int i = 1;i<n;i++){
            int take = a[i];
            if(i > 1){
                take += prev2;
            } 
            int notTake = 0 + prev;
            
            int curr = Math.max(take, notTake);   
            prev2 = prev;
            prev = curr;
        }
        return prev;
          
    } 
    
    
    
    
    // Tabulation 1 ms  (Bottom - Up Approach) 
    // TC -> O(N)   SC - > O(N) 
//     public int rob(int[] nums) {
//          int[] dp = new int[nums.length];
//          Arrays.fill(dp, -1);
//        return robRec(nums,dp);
          
//     } 
    
//     public int robRec(int[] a, int[] dp){
//         dp[0] = a[0];
//         int res = 0;
//         int n = a.length;
//         if(n < 2) return a[0];
        
//         for(int i = 1;i<n;i++){
//             int take = a[i];
//             if(i > 1){
//                 take += dp[i-2];
//             } 
//             int notTake = 0 + dp[i-1];
            
//             dp[i] = Math.max(take, notTake);   
//             res = Math.max(res, dp[i]);
//         }
//         return res;
//     }
    
    // Memoization 0 ms  (Top - Down Approach) 
    // TC -> O(N)   SC - > O(N) + O(N) 
//      public int rob(int[] nums) {
//          int[] dp = new int[nums.length];
//          Arrays.fill(dp, -1);
//        return robRec(nums,dp, nums.length-1);
          
//     } 
    
//     public int robRec(int[] a, int[] dp,  int index){
//         if(index == 0) return a[index];
//         if(index < 0) return 0;
//         if(dp[index] != -1) return dp[index];
        
//         int pick = a[index] + robRec(a,dp, index - 2);
//         int notPick = 0 + robRec(a,dp, index-1);
        
//         return dp[index] = Math.max(pick, notPick);
//     }
    
    //Normal Recursion TLE  TC -> O(2*N)
//     public int rob(int[] nums) {
//        return robRec(nums, nums.length-1);
          
//     }
    
//     public int robRec(int[] a, int index){
//         if(index == 0) return a[index];
//         if(index < 0) return 0;
        
//         int pick = a[index] + robRec(a,index - 2);
//         int notPick = 0 + robRec(a,index-1);
        
//         return Math.max(pick, notPick);
//     }
}