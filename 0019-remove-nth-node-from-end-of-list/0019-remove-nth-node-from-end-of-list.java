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
        ListNode temp=head;
        ListNode res=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c==1)
        return null;
        if(c==n)
        return head.next;
        for(int i=0;i<c-n-1;i++)//0->1
        {
            head=head.next;
        }
        head.next=head.next.next;
        return res;
    }
}