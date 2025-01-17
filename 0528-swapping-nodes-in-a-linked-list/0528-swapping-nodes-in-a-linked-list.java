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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int val=k-1;
        for(int i=0;i<list.size();i++)
        {
            if(i==val)
            {
                int temp = list.get(i); 
                list.set(i, list.get(list.size() - k)); 
                list.set(list.size() - k, temp); 
            }
        }
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        for(int i:list)
        {
            ListNode t1=new ListNode(i);
            temp.next=t1;
            temp=t1;
        }
        return ans.next;
    }
}