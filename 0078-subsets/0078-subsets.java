class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        
        helper(nums, set, new ArrayList<Integer>(), 0);
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    
    public void helper(int[] nums ,Set<List<Integer>> ans, ArrayList<Integer> list, int i){
       
        ans.add(new ArrayList<Integer>(list));
         if(i >= nums.length) return;
        list.add(nums[i]);
        helper(nums, ans, list, i+1);
        
        list.remove(Integer.valueOf(nums[i]));
        helper(nums, ans, list, i+1);
        
    }
}