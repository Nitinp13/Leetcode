class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "", s2 = "";
        for(String str : word1){
            s1 += str;
        }
        for(String str : word2){
            s2 += str;
        }
        
        if(s1.equals(s2)) return true;
        return false;
    }
}