class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            
        }
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            
            if(hm.containsKey(c) == false){
                return false;
            }else if(hm.get(c) == 1){
                hm.remove(c);
            }else{
                 hm.put(c, hm.get(c) - 1);
            }
        }
        
        return hm.size() == 0;
        
    }
}