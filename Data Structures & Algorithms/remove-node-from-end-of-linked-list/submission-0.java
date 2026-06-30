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

        ListNode dummy = new ListNode(0);
        dummy.next = head;
       

        ListNode curr=head;
        int len =0;
        while(curr!=null)
        {
            len = len + 1;
            curr = curr.next;
        }

         ListNode prev = dummy,
         c = head;


        int count = len - n + 1;
        int l =0;
        while(l<(count-1))
        {
            
            prev = prev.next;
            c = c.next;
            l = l+1;
        }
        prev.next = c.next;
        return dummy.next;

    }
}
