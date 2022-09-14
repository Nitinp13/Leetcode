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
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int count) {
        if (root == null) return 0;
        count ^= 1 << (root.val - 1);
        int res = dfs(root.left, count) + dfs(root.right, count);
        if (root.left == root.right && (count & (count - 1)) == 0) res++;
        return res;
    }

    // Memory limit exceed for 3 big tst case rest working correctly
//     int mycount = 0;
//     ArrayList<String> arr = new ArrayList<>();
//     public int pseudoPalindromicPaths (TreeNode root) {
//         if(root == null) return 0;
//         helper(root, "");
//         //int res = mycount;
//         // for(String s : arr){
//         //     System.out.println(s);
//         //     if(func(s)){
//         //         res++;
//         //     }
//         // }
//         return mycount;
//     }
    
//     public void helper(TreeNode root, String lst){
//         if(root == null) return;
//         if(root.left == null && root.right == null){
//            // arr.add(lst+root.val);
//             //System.out.println(lst+root.val);
//             if(func(lst+root.val)){
//                 mycount++;
//             }
//         }
//         helper(root.left, lst+root.val);
//         helper(root.right, lst+root.val);
//     }
    
//     public boolean func(String str){
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         for(char c : str.toCharArray()){
//             //int i = Integer.parseInt(""+c);
//             map.put(c, map.getOrDefault(c, 0)+1);
//         }
//         int codd = 0;
//         for(int v : map.values()) {
//             if(v % 2 == 1){
//                 codd++;
//             }
//             if(codd > 1) return false;
//         }
//         if(codd > 1){
//             return false;
//         }
//         return true;
        
//     }
}