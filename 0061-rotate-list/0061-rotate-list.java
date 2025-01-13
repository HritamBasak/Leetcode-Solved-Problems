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
    public ListNode rotateRight(ListNode head, int k) 
    {
        

        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c==1 || c==0)
        return head;
        if(k>=c)
        k=k%c;

        if(head==null && k==0)
        return null;

        if(head==null)
        return null;

        if(k==0)
        return head;
        ListNode temp1=head;
        ListNode top=temp1;
        for(int i=0;i<(c-k)-1;i++)
        {
            temp1=temp1.next;
        }
        ListNode t=temp1.next;
        ListNode ans=t;
        temp1.next=null;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=top;

        return ans;
    }
}