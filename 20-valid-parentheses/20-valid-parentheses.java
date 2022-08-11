class Solution {
    // 6ms soln
//     public boolean isValid(String s) {
//         if(s.length()%2 != 0){
//             return false;
//         }
//         Stack<Character> st = new Stack<>();
//         HashMap<Character, Character> h = new HashMap<>();
//         h.put(')', '(');
//         h.put(']', '[');
//         h.put('}', '{');
        
//         // for(int i = 0;i<s.length();i+=2){
//         //     char c = s.charAt(i);
//         //     char ch = s.charAt(i+1);
//         //     if(h.containsKey(ch) && c != h.get(ch)) return false;
//         // }
        
//         for(int i = 0;i<s.length();i++){
//             char c = s.charAt(i);
//             if(h.containsValue(c)){
//                 st.push(c);
//             }else{
//                if(st.isEmpty() || st.pop() != h.get(c)){
                   
//                    return false;
//                }
//             }
//         }
        
//         return st.isEmpty();
//     }
    //Short soln 3ms
    // Note if you dont use stack and use character array then the complexity is 0ms
    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
}