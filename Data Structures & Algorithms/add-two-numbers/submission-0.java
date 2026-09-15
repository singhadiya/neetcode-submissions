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
        int carry=0;
        ListNode curr = new ListNode();
        ListNode res = curr;
        int rem = 0;
        while(l1 != null && l2 != null){
            rem = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val + carry)/10;
            ListNode temp = new ListNode(rem);
            curr.next = temp;
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(!(l1 == null && l2 == null)){
            l1 = (l2 == null) ? l1 : l2;
            while(carry!=0 && l1 != null){
                rem = (l1.val +carry ) % 10;
                carry = (l1.val + carry ) / 10;
                ListNode temp = new ListNode(rem);
                curr.next = temp;
                curr = curr.next;
                l1 = l1.next;
            }

            if(carry == 0 && l1 != null){
                curr.next = l1;
            }
            if(carry == 1 && l1 == null){
                    ListNode temp = new ListNode(1);
                    curr.next = temp;
            }
        }else{   
            if(carry == 1){
                 ListNode temp = new ListNode(1);
                    curr.next = temp;
                }
        }     
        
        return res.next; 


    }
}
