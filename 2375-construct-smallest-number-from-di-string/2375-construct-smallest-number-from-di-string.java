class Solution {
    public String smallestNumber(String pt) {
        StringBuilder str = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        char[] cr = pt.toCharArray();
        
        int j=0;
        for(int i = 0; i < cr.length; i++){
            if(cr[i] == 'I'){
                str.append(arr.get(0));
                arr.remove(0);
            }else{
                int count = 0;
                j = i;
                while(j < cr.length && cr[j] == 'D'){
                    j++;
                    count++;
                }
                for(int a = count;a > 0;a--){
                    str.append(arr.get(a));
                    arr.remove(a);
                }
                i = j-1;
                
                
            }
            
            
        }
        if(cr[cr.length-1] == 'I' || j >= cr.length){
            str.append(arr.get(0));
        }else{
            str.append(arr.get(1));
        }
        return str.toString();
        
        
        
    }
}