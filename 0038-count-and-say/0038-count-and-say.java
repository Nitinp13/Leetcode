class Solution {
    public String countAndSay(int n) {
        String res = "1";
        
        for(int i = 1; i < n;i++){
            res = helper(res);
        }
        return res;
        
    }
    
    public String helper(String str){
        int count = 1;
        char prev = str.charAt(0);
        String ans = "";
        
        for(int i = 1;i< str.length();i++){
            
            if(str.charAt(i) == prev){
                count++;
            }else{
                ans += count +""+prev;
                prev = str.charAt(i);
                count = 1;
            }
        }
        if(count >= 1){
            ans += count+""+prev;
        }
        return ans;
    }
}