class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int valsum = 0;
        
        for(int i = 0;i < nums.length;i++){
            valsum += nums[i];
            
            while(valsum >= target){
               result = Math.min(result, i+1 - left);
                 valsum -= nums[left];
                left++;
            }
        }
        
        return (result != Integer.MAX_VALUE) ? result : 0;
    }
}