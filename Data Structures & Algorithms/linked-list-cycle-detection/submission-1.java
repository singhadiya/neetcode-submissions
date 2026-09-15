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
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null && !slow.equals(fast)){
            System.out.println("slow : "+slow.val);
            System.out.println("fast : "+fast.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("slow : "+slow.val);
        System.out.println("fast : "+fast.val);
        if(slow.equals(fast)){
            return true;
        }
        return false;
    }
}
