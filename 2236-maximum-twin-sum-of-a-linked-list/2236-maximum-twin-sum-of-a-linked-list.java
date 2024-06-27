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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public int pairSum(ListNode head) 
    {
      //Memory Limit Exceeded
      /*List<Integer> list=new ArrayList<>();
      ListNode temp=head;
      while(head!=null)
      {
        list.add(head.val);
      }
      int max=0,c=0;
      for(int i=0;i<list.size();i++)
      {
        c=list.get(i)+list.get(list.size()-i-1);
        if(c>max)
        max=c;
      }
      return max;*/

    /*ListNode prev = null;
    ListNode curr = head;
    while (curr != null) 
    {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    // Step 2: Count the nodes in the list
    ListNode temp = head;
    int c = 0;
    while (temp != null) 
    {
        c++;
        temp = temp.next;
    }
    // Step 3: Calculate the max pair sum
    int max = 0;
    int s = 0;
    ListNode t = head;
    ListNode reversed = prev;
    for (int i = 0; i < c / 2; i++) 
    {
        s = t.val + reversed.val;
        System.out.println(s);
        if (s > max) 
        {
            max = s;
        }
        t = t.next;
        reversed = reversed.next;
    }
    return max;*/

    //Slow and fast pointer approach/Two Pointer
    if(head==null)
    return 0;

    int max=0;
    ListNode slow=head;
    ListNode fast=head;

    while(fast!=null && fast.next!=null && fast.next.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    slow.next=reverse(slow.next);
    
    ListNode start=head;
    while(slow.next!=null)
    {
      max=Math.max(start.val+slow.next.val,max);
      start=start.next;
      slow=slow.next;
    }
    return max;
    }
}