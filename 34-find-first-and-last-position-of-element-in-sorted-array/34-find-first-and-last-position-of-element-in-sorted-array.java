class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int fi = -1;
        int si = -1;
        while(l<=r){
            int mid = (l+r)/2;
            int a = nums[mid];
            if(a == target){
                fi = mid;
                r = mid-1;
            }else if(a > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        
         l = 0;
        r = nums.length-1;
  
        while(l<=r){
            int mid = (l+r)/2;
            int a = nums[mid];
            if(a == target){
               si = mid;
                l = mid+1;
            }else if(a > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
       int[] ans = new int[2];
        ans[0] = fi;
        ans[1] = si;
        return ans;
       
    }
}