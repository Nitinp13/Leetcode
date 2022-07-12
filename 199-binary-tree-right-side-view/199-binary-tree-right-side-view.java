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
    public int max = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res, 0);
        return res;
    }
    
     public void helper(TreeNode root, List<Integer> list, int h) {
        if(root == null) return;
        
          if(max <= h){
              list.add(root.val);
              max++;
          }
         helper(root.right, list, h+1);
         helper(root.left, list, h+1);
         return;
    }
    
}