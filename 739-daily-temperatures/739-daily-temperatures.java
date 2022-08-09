class Solution {
    // Better soln 
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int hottest = 0;
        int answer[] = new int[n];
        
        for (int currDay = n - 1; currDay >= 0; currDay--) {
            int currentTemp = temperatures[currDay];
            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }
            
            int days = 1;
            while (temperatures[currDay + days] <= currentTemp) {
                // Use information from answer to search for the next warmer day
                days += answer[currDay + days];
            }
            answer[currDay] = days;
        }
        
        return answer;
    }
    
    // normal soln 223 ms
//     public int[] dailyTemperatures(int[] temp) {
//         int n = temp.length;
//         int[] res = new int[n];
//         Stack<Integer> st = new Stack<Integer>();
//         // st.push(temp[n-1]);
//         for(int i = n-1;i>=0;i--){
//             if(st.isEmpty()){
//                 res[i] = 0;
//                 st.push(i);
//             }else{
//                 if(temp[i] < temp[st.peek()]){
//                     res[i] = st.peek() - i;
//                     st.push(i);
//                 }else{
//                     while(!st.isEmpty() && temp[i] >= temp[st.peek()]){
//                         st.pop();
//                     }
                    
//                     if(st.isEmpty()){
//                         res[i] = 0;
//                         st.push(i);
//                     }else{
//                         res[i] = st.peek() - i;
//                         st.push(i);
//                     }
//                 }
//             }
//         }
//         return res;
//     }
}