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
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {   
          ListNode start=headB;
          while(headA!=null)
          {
            headB=start;
            while(headB!=null)
            {
                if(headB==headA)
                return headA;

                headB=headB.next;
            } 
            headA=headA.next;
          }
          return null;
    }
}