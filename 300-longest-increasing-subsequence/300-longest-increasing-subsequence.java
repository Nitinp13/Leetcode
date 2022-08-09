class Solution {
     public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
         
        for(int i = 1; i < nums.length;i++){
            if(nums[i] > arr.get(arr.size() - 1)){
                arr.add(nums[i]);
            }else{
                int ind = lowerbound(arr, nums[i]);
                arr.set(ind, nums[i]);
            }
        
        }
    return arr.size();
}
    public int lowerbound(ArrayList<Integer> nums, int key){
        int low = 0, high = nums.size();
        int mid;
        while(low < high){
            mid = low + (high - low)/2;
            
            if(key <= nums.get(mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    
//     public int lis(int ind, int prev, int[] nums,int n, ArrayList<ArrayList<Integer>> arr){
//         if(ind == n) return 0;
//         if(arr.get(ind).get(prev+1) != -1){
//             return arr.get(ind).get(prev+1);
//         }
        
//         int len;
//         len = 0 + lis(ind+1, prev, nums, n, arr);
        
//         if(prev == -1 || nums[ind] > nums[prev]){
//             len = Math.max(len, 1 + lis(ind+1, ind, nums, n, arr));
//         }
//         return arr.get(ind).get(prev+1) = len;
//     }
    // public int lengthOfLIS(int[] nums) {
    //     ArrayList<ArrayList<Integer>> arr = new ArrayList<>(Collections.nCopies(16, -1));
    //     int res = lis(0, -1, nums, nums.length, arr);
    //     return res;
    // }
}