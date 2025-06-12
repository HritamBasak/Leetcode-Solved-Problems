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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=cur;
        ListNode prev=dummy;

        while(cur!=null)
        {
            if(cur.next!=null && cur.val==cur.next.val)
            {
                while(cur.next!=null && cur.val==cur.next.val )
                {
                    cur=cur.next;
                }
                prev.next=cur.next;
            }
            else
            {
                prev=prev.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}