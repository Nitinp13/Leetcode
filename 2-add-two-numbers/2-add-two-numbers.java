/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = helper(l1, l2, 0);
        return res;
    }
    
    public ListNode helper(ListNode l1, ListNode l2, int rem){
        if(l1 == null && l2 == null){
            if(rem > 0){
                return new ListNode(rem);
            }
            return null;
        } 
        
        int sum = rem;
        sum += l1 == null ? l2 == null ? 0 : l2.val : l2 == null ? l1.val : l1.val+l2.val;
        int nrem = 0;
        if(sum >9){
            nrem = sum/10;
            sum %= 10;
        }
         ListNode ans;
      //  if(l1 == null && l2 == null){
        //     sum+= nrem;
        //     ans = new ListNode(sum);
        //     return ans;
        // } 
        System.out.println(sum+" ");
       ans = new ListNode(sum);
        ans.next = helper(l1 == null ? null : l1.next,l2 == null ? null : l2.next,nrem);
        return ans;
    }
}