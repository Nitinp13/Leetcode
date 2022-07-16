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
       // if(root.val == subRoot.val){
            if(sameTree(root, subRoot)) return true;
        //
        
       // if(root != null && subRoot != null && root.val != subRoot.val){
           return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
      //  }
        
       // return false;
        
    }
    public boolean sameTree(TreeNode A, TreeNode B){
        // if(A == null && B != null || A != null && B == null){
        //     return false;
        // }
    
        if(A== null && B==null) return true;
        if(A == null || B == null) return false;
        if(A.val != B.val) return false;
        
        // if(A.right != null && B.right == null || A.right == null && B.right != null
        //   && A.left != null && B.left == null || A.left == null && B.left != null){
        //     return false;
        // }
        // if(A.left == null && B.left == null && A.right == null && B.right == null){
        //     return true;
        // }
        
        return sameTree(A.left, B.left) && sameTree(A.right, B.right);
        
        
    }
}