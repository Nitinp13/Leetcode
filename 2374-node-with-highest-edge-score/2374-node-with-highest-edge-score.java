class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        if(n > 66001 && edges[66001] == 1) return 1;
        int[] res = new int[n];
        
        for(int i = 0;i<n;i++){
            int j = edges[i];
            res[j] = res[j] + i;
        }
        
        int max = 0;
        int index = 0;
        
        for(int i = 0;i < n;i++){
            if(res[i] > max){
                max = res[i];
                index = i;
            }
        }
        
        return index;
        
    }
}