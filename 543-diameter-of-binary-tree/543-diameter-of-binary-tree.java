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
    //Better Soln
     class Pair{
        int height;
        int diameter;
         public Pair(){}
         public Pair(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Pair ans = diameterOfBinaryTreeHelper(root);
        return ans.diameter;
    }
    private Pair diameterOfBinaryTreeHelper(TreeNode root) {
        if (root == null){
            Pair res = new Pair(0,0);
            return res;
        }
        Pair resLeft = diameterOfBinaryTreeHelper(root.left);
        Pair resRight = diameterOfBinaryTreeHelper(root.right);
        
        Pair ans = new Pair();

        ans.height = 1 + Math.max(resLeft.height, resRight.height);
        ans.diameter = Math.max((resLeft.height + resRight.height), Math.max(resLeft.diameter, resRight.diameter));
        return ans;
        
    }
    //Normal Soln
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
        
//         int h = height(root.left) + height(root.right);
        
//         int leftChild = diameterOfBinaryTree(root.left);
//         int rightChild = diameterOfBinaryTree(root.right);
        
//         return Math.max(h,Math.max(leftChild,rightChild));
//     }
//     public int height(TreeNode root){
//         if(root == null) return 0;
        
//         return 1 + Math.max(height(root.left), height(root.right));
//     }
}