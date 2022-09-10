class Solution {
    public int maxProfit(int[] prices) {
        //int res = 0;
        int max = prices[prices.length-1];
        int prof = 0;
        
        for(int i = prices.length-2;i>=0;i--){
            int p = prices[i];
            prof = Math.max(prof, max - p);
            max = Math.max(max, p);
            
        }
        return prof;
    }
}