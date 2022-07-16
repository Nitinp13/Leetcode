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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
       
            if(sameTree(root, subRoot)) return true;       
    
           return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
      
        
    }
    public boolean sameTree(TreeNode A, TreeNode B){
    
        if(A== null && B==null) return true;
        if(A == null || B == null) return false;
        if(A.val != B.val) return false;
        
        
        return sameTree(A.left, B.left) && sameTree(A.right, B.right);
        
        
    }
}