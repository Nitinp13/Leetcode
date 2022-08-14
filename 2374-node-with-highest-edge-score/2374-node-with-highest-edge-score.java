class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
       // if(n > 66001 && edges[66001] == 1) return 1;
        long[] res = new long[n];
        
        for(int i = 0;i<n;i++){
            
            res[edges[i]] += i;
        }
        
        int max = 0;
        
        
        for(int i = 0;i < n;i++){
            if(res[i] > res[max]){
                
                max = i;
            }
        }
        
        return max;
        
    }
}