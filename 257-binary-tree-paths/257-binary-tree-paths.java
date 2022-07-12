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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rst = new ArrayList<String>();
        if(root == null) return rst;
        StringBuilder sb = new StringBuilder();
        helper(rst, sb, root);
        return rst;
    }
    
    public void helper(List<String> rst, StringBuilder sb, TreeNode root){
        if(root == null) return;
        int tmp = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            rst.add(sb.toString());
            sb.delete(tmp , sb.length());
            return;
        }
        sb.append(root.val + "->");
        helper(rst, sb, root.left);
        helper(rst, sb, root.right);
        sb.delete(tmp , sb.length());
        return;
        
    }

//     public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res = new ArrayList<>();
//         helper(root, "", res);
//         return res;
//     }
// public void helper(TreeNode root, String str, List<String> list){
//     if(root == null) return;
        
//         if(root.right == null && root.left == null){
//             str = str+root.val;
//             list.add(str);
//             return;
//         }
//         str = str+root.val+"->";
//         helper(root.left, str, list);
//         helper(root.right, str, list);
//         return;

//     }
}