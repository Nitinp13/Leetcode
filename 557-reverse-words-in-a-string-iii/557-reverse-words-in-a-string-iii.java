class Solution {
    public String reverseWords(String s) {
        String res = "";
        String[] sarr = s.split(" ");
        
        for(int i = 0;i<sarr.length;i++){
            if(i == 0){
                res += "";
            }else{
                res += " ";
            }
            res += helper(sarr[i]);
        }
        
        return res;
        
    }
    
    public String helper(String s){
        String str = "";
        for(int i = s.length()-1;i>=0;i--){
            str += s.charAt(i);
        }
        return str;
    }
}