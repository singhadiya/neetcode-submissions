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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        if(len == 1){
            head =  null;
            return head;
        }
        int index = len-n+1;
        if(index == 1){
            return head.next;
        }

        temp = head;
        len = index-1;
        index = 0;
        while(index!=len-1){
            index++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
}
