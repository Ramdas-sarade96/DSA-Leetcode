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
    public ListNode removeNodes(ListNode head)
    {

       ListNode current,next, prev;
       current = head;
       prev = null;
       while(current!=null)
       {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       head = prev;

           ListNode temp = head;
        int max = temp.val;

        while (temp.next != null) 
        {
            if (temp.next.val < max)
            {
                temp.next = temp.next.next;
            } 
            else
            {
                temp = temp.next;
                max = temp.val;
            }
        }

        current = head;
        prev = null;

        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }
}