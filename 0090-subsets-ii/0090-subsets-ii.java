class Solution {
            Set<ArrayList<Integer>> ans = new HashSet<ArrayList<Integer>>();

     public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
         helper(nums,0,new  ArrayList<Integer>());
         return new ArrayList<List<Integer>>(ans);
     }
    
    public void helper(int[] nums,int i, ArrayList<Integer> list){
        if(i >= nums.length) return;
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>(list);
        ArrayList<Integer> arr2 = new ArrayList<Integer>(list){{add(nums[i]);}};

        
        ans.add(arr1);
        ans.add(arr2);
        
        helper(nums, i+1, arr1);
      
        helper(nums, i+1, arr2);
    }
    
    //Not Complete for edge case i guess
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        
//         ans.add(new ArrayList<Integer>());
        
//         for(int i = 0;i<nums.length;i++){
//             List<Integer> list =  new ArrayList<Integer>();
//             for(int j = i;j<nums.length;j++){
//                 list.add(nums[j]);
//                  List<Integer> li =  new ArrayList<>(list);
                
//                 ans.add(li);
//             }
//         }
        
//          List<List<Integer>> res =  ans.stream().distinct().collect(Collectors.toList());
        
//         return res;
//     }
}