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
    //Better soln   TC O(n)
    public boolean isBalanced(TreeNode root){
        BalancedTreeBetter res = isBalancedBetter(root);
        return res.isBalanced;
    }
    public BalancedTreeBetter isBalancedBetter(TreeNode root){
        if (root == null){
            int height = 0;
            boolean isBalanced = true;
            BalancedTreeBetter ans = new BalancedTreeBetter();
            ans.height = height;
            ans.isBalanced = isBalanced;
            return ans;
        }
        BalancedTreeBetter leftBalanced = isBalancedBetter(root.left);
        BalancedTreeBetter rightBalanced = isBalancedBetter(root.right);
        int height = 1 + Math.max(leftBalanced.height, rightBalanced.height);
        boolean isBal = true;
        if (Math.abs(leftBalanced.height - rightBalanced.height) > 1){
            isBal = false;
        }
        if (!leftBalanced.isBalanced || !rightBalanced.isBalanced){
            isBal = false;
        }
        BalancedTreeBetter ans = new BalancedTreeBetter();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }
    
    class BalancedTreeBetter{
     int height;
     boolean isBalanced;
}
    
    // Normal Soln   TC O(n^2) OR O(n logn);
//     public boolean isBalanced(TreeNode root){
//         if (root == null){
//             return true;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);
        
//         if (Math.abs(leftHeight - rightHeight) > 1){
//             return false;
//         }
//         boolean isLeftBalanced = isBalanced(root.left);
//         boolean isRightBalanced = isBalanced(root.right);
//         return isLeftBalanced && isRightBalanced;
//     }
//     //height of a tree
//     public static int height(TreeNode root){
//         if (root == null){
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);
//         return 1 + Math.max(leftHeight, rightHeight);
//     }
}