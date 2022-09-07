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
    public String tree2str(TreeNode root) {
        if(root == null) return "";
        
        String str = ""+root.val;
        String ls = "", rs = "";
       // System.out.println(root+" : L"+root.left.val+" , R"+root.right);
        
        if(root.left == null && root.right == null) return str;
        
       // if(root.left != null){
            ls += "(";
            ls += tree2str(root.left);
            ls += ")";
       // }
        
         if(root.right != null){
            rs += "(";
            rs += tree2str(root.right);
            rs += ")";
        }
        return str+ls+rs;
        
    }
}