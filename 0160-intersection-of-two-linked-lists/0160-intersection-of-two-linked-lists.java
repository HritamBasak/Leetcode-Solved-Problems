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
          //Brute Force solution
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

        //Better Solution
        //   Map<ListNode,Integer> map=new LinkedHashMap<>();
        //   while(headA!=null)
        //   {
        //     map.put(headA,map.getOrDefault(headA,0)+1);
        //     headA=headA.next;
        //   }
        //   while(headB!=null)
        //   {
        //     map.put(headB,map.getOrDefault(headB,0)+1);
        //     headB=headB.next;
        //   }
        //   for(ListNode i:map.keySet())
        //   {
        //     if(map.get(i)==2)
        //     return i;
        //   }
        //   return null;

        //Optimal Solution
        int l1=0,l2=0;
        ListNode first=headA,second=headB;
        while(headA!=null)
        {
            l1++;
            headA=headA.next;
        }
        while(headB!=null)
        {
            l2++;
            headB=headB.next;
        }
        int diff=Math.abs(l2-l1);
        if(l1>l2)
        {
            for(int i=0;i<diff;i++)
            {
                first=first.next;
            }
        }
        if(l2>l1)
        {
            for(int i=0;i<diff;i++)
            {
                second=second.next;
            }
        }
        System.out.println(first.val+" "+second.val);
        while(first!=null || second!=null)
        {
            if(first==second)
            return first;
            first=first.next;
            second=second.next;
        }
        return null;
    }
}