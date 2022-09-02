class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() < 1 || needle.length() > haystack.length()) return -1;
        for(int i =0 ; i < haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(helper(i, 0, haystack, needle)) return i;
            }
               
        }
        return -1;
    }
 
    public boolean helper(int i , int j, String s1, String s2){
        while(j<s2.length()){
            if(i >= s1.length()) return false;
            if(s1.charAt(i) != s2.charAt(j)) return false;
            i++;
            j++;
        }
        return true;
    }
}