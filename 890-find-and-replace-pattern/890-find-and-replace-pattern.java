class Solution {
    public boolean isMatching(String str, String pattern){
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<pattern.length();i++){
            char wch = str.charAt(i);
            char pch = pattern.charAt(i);
            
            if(map.containsKey(pch) == true){
                //pattern character is already matched
                if(map.get(pch) != wch)
                    return false;
                
            }else{
                //pattern character is new for mapping
                if(set.contains(wch)){
                    return false;
                }
                map.put(pch, wch);
                set.add(wch);
                
            }
        }
        return true;
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for(String str : words){
            if(isMatching(str, pattern)){
                list.add(str);
            }
        }
        return list;
//         List<String> list = new ArrayList<>();
//         int n = pattern.length();
        
//         ArrayList<Integer> arr = findcount(pattern, n);
//         ArrayList<Integer> res;
//         boolean st = true;
        
//         for(int i = 0;i<n;i++){
//             String str = words[i];
        
//             res = findcount(str, n);
//             if(arr.size() != res.size()) continue;
            
//             for(int j = 0;j<arr.size();j++){
//               if(arr.get(j) != res.get(j)){
//                   st = false;
//               }
//             }
//             if(st == true){
//                 list.add(str);
//             }
//             res.clear();
//             st = true;
            
//         }
//         return list;
    }
    
//     public ArrayList<Integer> findcount(String str,int n){
//         ArrayList<Integer> arr = new ArrayList<>();
//         char ch = str.charAt(0);
//         int count = 1;
//         for(int i = 1;i<n;i++){
//             char c = str.charAt(i);
//             if(c == ch){
//                 count++;
//             }else{
//                 arr.add(count);
//                 ch = c;
//                 count = 1;
//             }           
            
//         }
//         return arr;
//     }
}