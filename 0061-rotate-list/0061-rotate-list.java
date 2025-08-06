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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int c=0;
        ListNode temp=head;
        ListNode ans=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(k>=c)
        k=k%c;

        ListNode dummy=new ListNode(-1);
        ListNode finalAns=dummy;
        for(int i=0;i<c-k-1;i++)
        {
            head=head.next;
        }
        ListNode res=head.next;
        head.next=null;
        dummy.next=res;
        while(dummy.next!=null)
        {
            dummy=dummy.next;
        }
        dummy.next=ans;
        return finalAns.next;
    }
}