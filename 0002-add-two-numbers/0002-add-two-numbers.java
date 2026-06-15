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
        int s=0;
        ListNode dummy=new ListNode(-1);
        ListNode d=dummy;
        while(l1!=null || l2!=null)
        {
            if(l1!=null)
            {
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                s+=l2.val;
                l2=l2.next;
            }
            int r=s%10;
            int n=s/10;
            s=n;
            dummy.next=new ListNode(r);
            dummy=dummy.next;
        }
        if(s==1) dummy.next=new ListNode(1);
        return d.next;
    }
}