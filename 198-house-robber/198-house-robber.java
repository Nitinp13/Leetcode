class Solution {
      //   public int rob(int[] nums) {
      // }
    
    // Memoirization 1 ms 
    // TC -> O(N)   SC - > O(N) + O(N) 
     public int rob(int[] nums) {
         int[] dp = new int[nums.length];
         Arrays.fill(dp, -1);
       return robRec(nums,dp, nums.length-1);
          
    } 
    
    public int robRec(int[] a, int[] dp,  int index){
        if(index == 0) return a[index];
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];
        
        int pick = a[index] + robRec(a,dp, index - 2);
        int notPick = 0 + robRec(a,dp, index-1);
        
        return dp[index] = Math.max(pick, notPick);
    }
    
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