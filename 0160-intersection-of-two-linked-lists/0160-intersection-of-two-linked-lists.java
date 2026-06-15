/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=0;
        int c2=0;
        ListNode first=headA;
        ListNode sec=headB;
        while(headA!=null)
        {
            c1++;
            headA=headA.next;
        }
        while(headB!=null)
        {
            c2++;
            headB=headB.next;
        }
        int diff=Math.abs(c2-c1);
        if(c1>c2)
        {
            for(int i=0;i<diff;i++)
            {
                first=first.next;
            }
        }
        if(c1<c2)
        {
            for(int i=0;i<diff;i++)
            {
                sec=sec.next;
            }
        }
        while(first!=null && sec!=null)
        {
            if(first==sec)
            return first;

            first=first.next;
            sec=sec.next;
        }
        return null;
    }
}