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
    public ListNode removeNodes(ListNode head) 
    {
       List<Integer> list=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null)
       {
        list.add(temp.val);
        temp=temp.next;
       }
       List<Integer> t=new ArrayList<>();
       int max=list.get(list.size()-1);
       for(int i=list.size()-1;i>=0;i--)
       {
           if(i==list.size()-1)
           t.add(list.get(i));

           else
           {
            if(list.get(i)>=max)
            {
                t.add(list.get(i));
                max=list.get(i);
            }
           }
       }
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        for(int i=t.size()-1;i>=0;i--)
        {
            ListNode f=new ListNode(t.get(i));
            dummy.next=f;
            dummy=f;
        }
        return res.next;
    }
}