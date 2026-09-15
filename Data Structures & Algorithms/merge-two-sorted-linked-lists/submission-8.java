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

       ListNode temp = null;
       ListNode head = (list1.val <= list2.val)? list1 : list2;

       while(list1 != null && list2 != null){

        System.out.println("list1.val : "+list1.val);
        System.out.println("list2.val : "+list2.val);
        printNode(head);
        if(list1.val<=list2.val){
            System.out.println("inside if condition");
            while(list1.next != null  && list1.next.val <= list2.val ){
                 list1 = list1.next;
            }
            temp = list1.next;
            list1.next = list2;
            list1 = temp;

        }else{
            System.out.println("inside else condition");
            while(list2.next != null  && list2.next.val <= list1.val ){
                 list2 = list2.next;
            }
            temp = list2.next;
            list2.next = list1;
            list2 = temp;
        }
       }
       if(list1 == null){
        list1 = list2;
       }
       if(list2 == null){
        list2 = list1;
       }

       return head;
    }

    public void printNode(ListNode node){
        while(node != null){
            System.out.print(","+node.val);
            node = node.next;
        }
        System.out.println("");
    }
}