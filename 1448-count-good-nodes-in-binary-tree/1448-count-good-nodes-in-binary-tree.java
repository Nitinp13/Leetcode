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
    public int goodNodes(TreeNode root) {
        
        
        int count = helper(root, root.val);
        return count;
    }
    
    private int helper(TreeNode root, int max){
        if(root == null) return 0;
        
        int count = 0;
        if(root.val >= max){
            count++;
            System.out.println(root.val);
        }
        max = Math.max(max, root.val);
        count += helper(root.left, max) + helper(root.right, max);
        return count;
    }
}