class Solution {
     public int numberOfWeakCharacters(int[][] properties) {
        // sorting 
        int n = properties.length;
        int count = 0;
        
        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            
            if (properties[i][1] < max) {
                count++;
            }
            max = Math.max(max, properties[i][1]);
        }
        return count;
    }
    
    
    //TLE for big input
//      public int numberOfWeakCharacters(int[][] p) {
//         //HashSet<String> map = new HashSet<>();
        
//         int count = 0;
//         for(int i = 0; i < p.length;i++){
//             int a = p[i][0];
//             int b = p[i][1];
            
//             for(int j = 0;j<p.length;j++){
//                 if(j == i) continue;
//                 if(a < p[j][0] && b < p[j][1]){
//                     count++;
//                     break;
//                 }
//             }
            
//             //count += lc;
//         }
//         return count;
//     }
    
    // Giving wrong answers for some test cases 
//     public int numberOfWeakCharacters(int[][] p) {
        
//         HashMap<String, Integer> hm = new HashMap<String, Integer>();
//         for(int[] arr : p){
//             hm.put(arr[0]+""+arr[1], hm.getOrDefault(arr[0]+""+arr[1], 0)+1);
//         }
        
//         HashSet<String> map = new HashSet<>();
        
        
//         for(int i = 0; i < p.length;i++){
//             int a = p[i][0];
//             int b = p[i][1];
            
//             for(int j = i+1;j<p.length;j++){
//                 if(a < p[j][0] && b < p[j][1]){
//                     map.add(a+""+b);
//                 }
                
//                 if(a > p[j][0] && b > p[j][1]){
//                     map.add(p[j][0]+""+p[j][1]);
//                    // System.out.println(p[j][0] +" , " + p[j][1] + " For "+a+"  & "+b);
//                 } 
//             }
            
//             //count += lc;
//         }
        
//         int count = 0;
//         for(String str : map){
//             count += hm.get(str);
//         }
        
//         return count;
//     }
    
//     Class Npnode(){
//         int x;
//         int y;
//         Node(int a, int b){
//             this.x = a;
//             this.y = b;
//         }
//     }
  
}