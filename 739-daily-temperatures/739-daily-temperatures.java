class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        // st.push(temp[n-1]);
        for(int i = n-1;i>=0;i--){
            if(st.isEmpty()){
                res[i] = 0;
                st.push(i);
            }else{
                if(temp[i] < temp[st.peek()]){
                    res[i] = st.peek() - i;
                    st.push(i);
                }else{
                    while(!st.isEmpty() && temp[i] >= temp[st.peek()]){
                        st.pop();
                    }
                    
                    if(st.isEmpty()){
                        res[i] = 0;
                        st.push(i);
                    }else{
                        res[i] = st.peek() - i;
                        st.push(i);
                    }
                }
            }
        }
        return res;
    }
}