class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i = 2*n - 1;i >= 0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i%n]){
                st.pop();
            }
            if(i < n){
                if(st.isEmpty() == false){
                    res[i] = st.peek();
                }else{
                    res[i] = -1;
                }
                
            }
            st.push(nums[i%n]);
            
        }
        
        return res;
        
    }
}