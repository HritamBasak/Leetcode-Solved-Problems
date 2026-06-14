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
        int c=0;
        ListNode temp1=head;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c==1)
        return null;
        if(c==n)
        return head.next;
        int diff=c-n;//0
        int i=1;
        while(i<diff)
        {
            head=head.next;
            i++;
        }
        head.next=head.next.next;
        return temp1;
    }
}