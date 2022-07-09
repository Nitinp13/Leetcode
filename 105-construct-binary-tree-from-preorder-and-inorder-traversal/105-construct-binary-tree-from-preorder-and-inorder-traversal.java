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
    public static TreeNode buildTree(int[] preOrder, int[] inOrder){
        int n = preOrder.length;

        int preStart = 0;
        int preEnd = n-1;
        int inStart = 0;
        int inEnd = n-1;

        return buildTreeInorderPreorder(preOrder,preStart,preEnd,inOrder,inStart,inEnd);
    }

    private static TreeNode buildTreeInorderPreorder(int[] preOrder, int preStart,int preEnd, int[] inOrder,int inStart,int inEnd){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        int rootVal = preOrder[preStart];
        TreeNode root = new TreeNode(rootVal);

        //Find root element index from inorder array
        int k = 0;
        for (int i = inStart; i <= inEnd ; i++) {
                if(rootVal == inOrder[i]){
                    k = i;
                    break;
                }
        }

        root.left = buildTreeInorderPreorder(preOrder, preStart + 1, preStart + (k - inStart), inOrder, inStart, k-1);
        root.right = buildTreeInorderPreorder(preOrder,preStart + (k - inStart) + 1,preEnd, inOrder,  k+1,inEnd);

        return root;
    }
}