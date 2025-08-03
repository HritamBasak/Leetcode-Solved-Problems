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
          //O(M*N) solution
        //   ListNode start=headB;
        //   while(headA!=null)
        //   {
        //     headB=start;
        //     while(headB!=null)
        //     {
        //         if(headB==headA)
        //         return headA;

        //         headB=headB.next;
        //     } 
        //     headA=headA.next;
        //   }
        //   return null;
          Map<ListNode,Integer> map=new LinkedHashMap<>();
          while(headA!=null)
          {
            map.put(headA,map.getOrDefault(headA,0)+1);
            headA=headA.next;
          }
          while(headB!=null)
          {
            map.put(headB,map.getOrDefault(headB,0)+1);
            headB=headB.next;
          }
          for(ListNode i:map.keySet())
          {
            if(map.get(i)==2)
            return i;
          }
          return null;
    }
}