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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      TreeNode root = buildTreeUsingPreorderAndInorder(
          IntStream.of(inorder).boxed().collect(Collectors.toList())
          , IntStream.of(preorder).boxed().collect(Collectors.toList()) ) ;
          
          return root;
    }
    
    public static TreeNode buildTreeUsingPreorderAndInorder(List<Integer> inOrder, List<Integer> preOrder){
        if (inOrder.isEmpty() || preOrder.isEmpty()){
            return null;
        }

        int rootData = preOrder.get(0);
       TreeNode root = new TreeNode(rootData);

        int rootIndexInorder = 0;
        for (int i = 0; i < inOrder.size();i++){
            if (rootData == inOrder.get(i)){
                rootIndexInorder = i;
                break;
            }
        }
        List<Integer> leftInorder = new ArrayList<>(inOrder.subList(0,rootIndexInorder));
        List<Integer> rightInorder = new ArrayList<>(inOrder.subList(rootIndexInorder+1, inOrder.size()));

        List<Integer> leftPreOrder = new ArrayList<>(preOrder.subList(1, leftInorder.size() + 1));
        List<Integer> rightPreOrder = new ArrayList<>(preOrder.subList(leftInorder.size() + 1, preOrder.size()));

        root.left = buildTreeUsingPreorderAndInorder(leftInorder, leftPreOrder);
        root.right = buildTreeUsingPreorderAndInorder(rightInorder, rightPreOrder);

        return root;

    }
}