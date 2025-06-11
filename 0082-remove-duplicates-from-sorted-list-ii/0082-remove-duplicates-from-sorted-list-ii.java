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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        ListNode temp=head;
        while(temp!=null)
        {
            int val=temp.val;
            map.put(val,map.getOrDefault(val,0)+1);
            temp=temp.next;
        }
        ListNode c=new ListNode(-1);
        ListNode cur=c;
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                ListNode f=new ListNode(i);
                c.next=f;
                c=f;
            }
        }
        return cur.next;
    }
}