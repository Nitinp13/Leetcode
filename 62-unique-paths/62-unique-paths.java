class Solution {
   public int uniquePaths(int m, int n) {
        int N= m+n-2;
         int r = m-1;
         double res = 1;
         
         for(int i = 1; i <=r;i++){
             res = res * (N-r + i)/i;
         }
         return (int)res;
        
    }
    //Naive or Brute force soln
//     public int uniquePaths(int m, int n) {
//         int res = helper(0,0, m-1, n-1);
//         return res;
        
//     }
//     public int helper(int i, int j, int m, int n){
//         if(i>m || j > n){
//             return 0;
//         }
//         if(i == m && j == n){
//             return 1;
//         }
//         System.out.println("i is "+i+" & j is "+j);
//         int count = 0;
//         count += helper(i, j+1, m, n);
//         System.out.println(count);
//         count += helper(i+1, j, m, n);
//         System.out.println(count);
//         return count;
        
//     }
}