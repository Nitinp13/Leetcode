/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }

        Queue<TreeNode> pendingChildrenToPrint = new LinkedList<TreeNode>() ;
        pendingChildrenToPrint.add(root);
        // List<Integer> l2 = new ArrayList<Integer>();
        // l2.add(root.val);
        // list.add(l2);

        while (!pendingChildrenToPrint.isEmpty()){
            int l = pendingChildrenToPrint.size();
            List<Integer> ans = new ArrayList<Integer>();
            for (int i  = 0;i< l;i++){
                TreeNode front = pendingChildrenToPrint.poll();
                if(front.left != null){
                    pendingChildrenToPrint.add(front.left);
                }
                if(front.right != null){
                    pendingChildrenToPrint.add(front.right);  
                }
                ans.add(front.val);
                
            }
            list.add(ans);


        }
        return list;
    }
}