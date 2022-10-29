class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        
        helper(candidates, target, new ArrayList<Integer>(), ans, 0);
        return ans;
    }
    
    public void helper(int[] cd, int t, ArrayList<Integer> list, List<List<Integer>> ans, int i){
        if(i >= cd.length || t < 0) return;
        list.add(cd[i]);
        if((t - cd[i]) == 0){
            System.out.println(list.toString() +" -> "+cd[i]);
            ans.add(new ArrayList<Integer>(list));
             list.remove(Integer.valueOf(cd[i]));
            return;
        }
            
        helper(cd, t-cd[i], list, ans, i);
        
        list.remove(Integer.valueOf(cd[i]));
        helper(cd, t, list, ans, i+1);
    }
}