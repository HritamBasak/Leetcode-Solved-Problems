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
    public ListNode oddEvenList(ListNode head) {
        ListNode even=new ListNode(-1);
        ListNode odd=new ListNode(-1);

        ListNode e=even;
        ListNode o=odd;

        int i=0;
        while(head!=null)
        {
            if(i%2==0)
            {
                e.next=head;
                e=e.next;
            }
            else
            {
                o.next=head;
                o=o.next;
            }
            i++;
            head=head.next;
        }
        e.next=odd.next;
        o.next=null;
        return even.next;
    }
}