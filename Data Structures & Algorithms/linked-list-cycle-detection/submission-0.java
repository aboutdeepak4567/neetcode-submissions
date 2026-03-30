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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode tmp = head;
        while(tmp != null){
            if(set.contains(tmp)){
                return true;
            }
            set.add(tmp);
            tmp = tmp.next;
            
        }
        return false;
        
    }
}
