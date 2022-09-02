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
    ArrayList<Long> sarr = new ArrayList<>();
    ArrayList<Long> iarr = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if(root == null) return list;
        helperAvg(root,0);
        for(int i = 0; i<sarr.size();i++){
            double res = (double)sarr.get(i)/(double)iarr.get(i);
            list.add(res);
        }
        return list;
    }
    public void helperAvg(TreeNode root, int level){
        if(root == null) return;
        if(level >= sarr.size()){
            sarr.add(0L);
            iarr.add(0L);
        }
        sarr.set(level, sarr.get(level)+root.val);
        iarr.set(level, iarr.get(level)+1);

        helperAvg(root.left, level+1);
        helperAvg(root.right, level+1);
    }
}