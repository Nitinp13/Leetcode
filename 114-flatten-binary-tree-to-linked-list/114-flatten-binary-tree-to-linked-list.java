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
     ArrayList<Integer> list = new ArrayList<>();
    
    public void flatten(TreeNode root) {
        if(root == null) return;
        
        helper(root);
        root.left = null;
        // root.right = null;
        for(int i = 1;i<list.size();i++){
            root.right = new TreeNode(list.get(i));
            root = root.right;
        }
        
    }
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        
        helper(root.left);
        helper(root.right);
    }
}