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
    HashMap<Integer, HashMap<Integer, ArrayList<Integer>> > map = new HashMap<>();
    ArrayList<Integer> narr = new ArrayList<Integer>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        nodesep(root, 0,0);
       // System.out.print(map + " sfd" + narr);
        
        Collections.sort(narr);
        for(int i : narr){
              ArrayList<Integer> re = addtoMap(i);
            list.add(re);
        }
        return list;
    }
    
    public ArrayList<Integer> addtoMap(int x){
        ArrayList<Integer> arr = new ArrayList<>();
        
        //HashMap<Integer, ArrayList<Integer>> h = map.get(x);
        
        ArrayList<Integer> keyset = new ArrayList<>(map.get(x).keySet());
        Collections.sort(keyset);
        
        for(int i : keyset){
            ArrayList<Integer> k = map.get(x).get(i);
            Collections.sort(k);
            arr.addAll(k);
        }
        return arr;
        
    }
    
    public void nodesep(TreeNode root, int x, int y){
        if(root == null) return;
        ArrayList<Integer> arr;
        HashMap<Integer, ArrayList<Integer> > hm;
        
        if(!map.containsKey(y)){
            arr = new ArrayList<Integer>();
            hm = new HashMap<>();
            arr.add(root.val);
           narr.add(y);
        }else if(!map.get(y).containsKey(x)){
             arr = new ArrayList<Integer>();
            hm =  map.get(y);
            arr.add(root.val);
            
        }else{
            arr = map.get(y).get(x);
            arr.add(root.val);
            
              hm =  map.get(y);
        }
        
        
        hm.put(x, arr);
        
      map.put(y, hm);
        
        
        nodesep(root.left, x+1, y-1);
         nodesep(root.right, x+1,y+1);
       
    }
}