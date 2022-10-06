class Solution {    
    //Third Try
    //4 ms $ 2ms
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        Set<Integer> rmap = new HashSet<Integer>();
        Set<Integer> cmap = new HashSet<Integer>();
        
         for(int i = 0;i<m;i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j] == 0){
                    rmap.add(i);
                    cmap.add(j);
                }
            }
         }
        
        for(int i : rmap){
            helprow(matrix, i, n);
        }
        
        for(int i : cmap){
            helpcol(matrix, i, m);
        }
        return;
        
    }
    
    public void helprow(int[][] matrix, int r, int n){
        for(int i = 0;i<n;i++){
            matrix[r][i] = 0;
        }
        return;
    }
    public void helpcol(int[][] matrix, int c, int m){
        for(int i = 0;i<m;i++){
            matrix[i][c] = 0;
        }
        return;
    }
    
    
    //Second Try
//      public void setZeroes(int[][] matrix) {
//         HashMap<String, Boolean> map = new HashMap<>();
//           int m = matrix.length;
//         int n = matrix[0].length;
        
        // for(int i = 0;i<m;i++){
        //     for(int j = 0; j < n;j++){
//                 if(map.containsKey("r"+i)) break;
//                 if(map.containsKey("c"+j)) continue;
//                if(matrix[i][j] == 0){
//                     if(!map.containsKey("r"+i) && !map.containsKey("c"+j)){
//                     helper(matrix, i, j, m, n, "b");
//                     map.put("r"+i, true);
//                     map.put("c"+j, true);
                    
//                 }else if(!map.containsKey("r"+i)){
//                     helper(matrix, i, j, m, n, "r");
//                      map.put("r"+i, true);
//                 }else if(!map.containsKey("c"+j)){
//                     helper(matrix, i, j, m, n, "c");
//                      map.put("c"+j, true);
//                 }
//                }
                
//             }
//         }
//          return;
         
//     }
//     public void helper(int[][] matrix, int r,int c, int m, int n, String ans){
//         if(ans.equals("r") || ans.equals("b")){
//             for(int j = 0;j<n;j++){
//                 matrix[r][j] = 0;
//             }
//         }
        
//         if(ans.equals("c") || ans.equals("b")){
//             for(int j = 0;j<m;j++){
//                 matrix[j][c] = 0;
//             }
//         }
//         return;
         
//     }
    
    //Brute Force 
    //Obviouly TLE
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
        
//         for(int i = 0;i<m;i++){
//             for(int j = 0; j < n;j++){
//                 helper(matrix, i, j, m, n);
//             }
//         }
//         return;
        
//     }
    
//     public void helper(int[][] matrix, int i, int j, int m,int n){
        
//         if(i < 0 || j < 0 || i > m || j > n){
//             return;
//         }
//         matrix[i][j] = 0;
        
//         helper(matrix, i, j-1,m,n);
//         helper(matrix, i, j+1,m,n);

//         helper(matrix, i-1,j,m,n);
//         helper(matrix, i+1,j,m,n);
        
        
//     }
}