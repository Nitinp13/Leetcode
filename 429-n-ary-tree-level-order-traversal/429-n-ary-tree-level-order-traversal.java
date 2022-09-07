/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        list.add(Arrays.asList(root.val));
        
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            
            for(int i = list.get(list.size()-1).size();i>0;i--){
                Node fr = q.poll();
                for(Node ch : fr.children){
                    if(ch != null){
                         q.add(ch);
                ans.add(ch.val);
                    }
                   
                }
                
            }
            if(!ans.isEmpty())
               list.add(ans);            
        }
             
        return list;
    }
}