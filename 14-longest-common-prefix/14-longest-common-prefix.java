class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i = 0; i < strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j = 1;j<strs.length;j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != c) return res;
            }
            res += c;
        }
        return res;
    }
}