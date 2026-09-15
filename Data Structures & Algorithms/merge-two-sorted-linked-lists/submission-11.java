

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode Head = null;
        ListNode l1 = null;
        ListNode l2 = null;

        l1 = list1.val <= list2.val ? list1 : list2;
        l2 = list1.val <= list2.val ? list2 : list1;
        Head  = l1;
        System.out.println("l1 : "+l1);
        System.out.println("l2 : "+l2);
        System.out.println("Head : "+Head);
        
        while(l1 != null && l2 != null){

            while((l1.next != null) && (l2 != null) && (l1.next.val <= l2.val)){
                   l1 = l1.next;
            }
            ListNode temp = l1.next;
            l1.next = l2;
            l1 = l1.next;
            l2 = temp;

        }
        if(l1 == null){
            l1 = l2;
        }else{
            l2= l1;
        }

        return Head;
    }
}
