/**
 * Definition for singly-linked list.
 * class ListNode {
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
    public ListNode detectCycle(ListNode head) 
    {
       int c=0;
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
          if(slow==fast)
          {
            break;
          }
       } 
        if (fast == null || fast.next == null) {
            return null;
        }
       do
       {
         c++;
         fast=fast.next;
       }while(slow!=fast);

       ListNode sloww=head;
       ListNode fastt=head;
       int i=0;
       while(i<c)
       {
          sloww=sloww.next;
          i++;
       }
       while(sloww!=fastt)
       {
          sloww=sloww.next;
          fastt=fastt.next;
       }
       return sloww;
    }
}