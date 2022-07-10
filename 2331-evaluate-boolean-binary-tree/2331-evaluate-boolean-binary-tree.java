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
    public boolean evaluateTree(TreeNode root) {
        
        if(root.val == 0) return false;
        if(root.val == 1) return true;
        if(root.val == 2){
            boolean v = evaluateTree(root.left) || evaluateTree(root.right);
            return v;
        }
        if(root.val == 3){
             boolean v = evaluateTree(root.left) && evaluateTree(root.right);
            return v;
        }
        return false;
        
    }
    // public boolean or(int val1, int val2){
    //     if(val1 == 1 || val2 == 1){
    //         return true;
    //     }else{
    //         return false;
    //     }
    //     return false;
    // }
    //  public boolean and(int val1, int val2){
    //     if(val1 == 1 && val2 == 1){
    //         return true;
    //     }else{
    //         return false;
    //     }
    //     return false;
    // }
    
   
}