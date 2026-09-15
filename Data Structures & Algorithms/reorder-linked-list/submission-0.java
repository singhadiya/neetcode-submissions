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
    public void reorderList(ListNode head) {
        int len = 0;
        ListNode len_counter= head;
        while(len_counter != null){
            len++;
            len_counter = len_counter.next;
        }
        if(len <= 2){
            return ;
        }

        ListNode list1=head ,list2=null;
        System.out.println("full length : "+len);
        len = (len%2==0)?len/2:len/2+1;
        int count=0;
        System.out.println("half length : "+len);

        while(count<len-1){
          count++;
          list1 = list1.next;
        }
        System.out.println("count : "+count);
        list2  = list1.next;
        list1.next = null;
        list1 = head;
        
        list2 = reverseList(list2);
        System.out.println("list1");
        print(list1);
        System.out.println("list2");
        print(list2);

        // count = 0;
        ListNode temp1 = null;
        ListNode temp2 = null;
        // while(count < len){
        //     count++;
        //     temp1 = list1.next;
        //     list1.next = list2;
        //     temp2 = list2.next;
        //     list1 = temp1;
        //     list2.next = list1;
        //     list2 = temp2;
        // }
        while(list2 != null){
            temp1 = list1.next;
            temp2 = list2.next;
            list1.next = list2;
            list2.next = temp1;
            list2 = temp2;
            list1 = temp1;
        }   
        head =  list1;
    }

    public ListNode reverseList(ListNode l){
        ListNode prev = null;
        ListNode curr = l;
        ListNode next = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void print(ListNode l){
        while(l!=null){
            System.out.print(","+l.val);
            l = l.next;
        }
        System.out.println("");
    }
}
