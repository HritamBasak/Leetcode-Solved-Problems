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
class Solution 
{
    public void reorderList(ListNode head)
    {
        // ListNode slow=new ListNode(-1);
        // slow.next=rev;
        // ListNode first=slow.next;
        // //first:1->2->null
        // ListNode fast=rev;
        // while(fast!=null && fast.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // ListNode dummy=slow.next;
        // slow.next=null;
        // ListNode prev=null;
        // ListNode cur=dummy;
        // ListNode next=null;
        // while(cur!=null)
        // {
        //     next=cur.next;
        //     cur.next=prev;
        //     prev=cur;
        //     cur=next;
        // }
        // //prev:4->3
        // ListNode d=new ListNode(0);
        // ListNode c=d;
        // while(first!=null && prev!=null)
        // {
        //     if(first!=null)
        //     {
        //         d.next=first;
        //         first=first.next;
        //         d=d.next;
        //     }
        //     if(prev!=null)
        //     {
        //         d.next=prev;
        //         prev=prev.next;
        //         d=d.next;
        //     }
        // }
        // return c.next;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;

        ListNode prev=null;
        ListNode cur=temp;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            if (temp1 == null) break;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}