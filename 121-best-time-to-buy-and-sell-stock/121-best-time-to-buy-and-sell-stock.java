class Solution {
    // from behind checking which value generates maximum profit while subtracting each with max val 
//     public int maxProfit(int[] prices) {
//         //int res = 0;
//         int max = prices[prices.length-1];
//         int prof = 0;
        
//         for(int i = prices.length-2;i>=0;i--){
//             int p = prices[i];
//             prof = Math.max(prof, max - p);
//             max = Math.max(max, p);
            
//         }
//         return prof;
//     }
    
    //from starting check which value generates max profits by subtracting least value so far from it
     public int maxProfit(int[] prices) {
        //int res = 0;
        int min = prices[0];
        int prof = 0;
        
        for(int i = 1;i< prices.length;i++){
            int p = prices[i];
            prof = Math.max(prof, p-min);
            min = Math.min(min, p);
            
        }
        return prof;
    }
}