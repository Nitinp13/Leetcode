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
    public int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumhelper(root);
        return maxSum;
    }
    private int maxPathSumhelper(TreeNode root){
        if(root == null) return 0;
        int leftMax = maxPathSumhelper(root.left);
        int rightMax = maxPathSumhelper(root.right);
        
        int maxRightLeft = Math.max(leftMax, rightMax);
        int maxRootNode = Math.max(root.val, (root.val + maxRightLeft));
        int maxAll = Math.max(maxRootNode, (root.val + leftMax + rightMax));
        
        maxSum = Math.max(maxSum, maxAll);
        
        return maxRootNode;
        
    }
}