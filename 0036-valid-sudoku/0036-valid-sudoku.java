class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.') continue;
                
                if(!helper1(board, i, j, board[i][j])) return false;
            }
        }
        
         for(int i = 0; i < 9;i = i + 3){
             for(int j = 0;j<9;j = j+3){
                 if(!helper2(board, i, j)) return false;
             }
         }
        return true;
    }
    
    public boolean helper1(char[][] board, int i, int j, char n){
        
        for(int a = 0;a<9;a++){
           if(a == i) continue;
            if(board[a][j] == n)return false;
        }
        
        for(int a = 0;a<9;a++){
           if(a == j) continue;
            if(board[i][a] == n)return false;
        }
        
        return true;
    }
    
    public boolean helper2(char[][] board, int i, int j){
        HashSet<Character> map = new HashSet<>();
        int m = i,n=j;
        for(i = m;i<m+3;i++){
            for(j = n;j<n+3;j++){
                if(board[i][j] == '.') continue;
                
                if(map.contains(board[i][j])) return false;
                else 
                    map.add(board[i][j]);
            }
        }
        return true;
    }
}