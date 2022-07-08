class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length()-1;
        int count = 0;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return vP(s,l+1,r) || vP(s, l, r-1);
            }
            l++;
            r--;
        }
        return true;
        
    }
    
    private boolean vP(String s , int i , int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}