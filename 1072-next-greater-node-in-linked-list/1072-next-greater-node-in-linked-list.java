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
    public int[] nextLargerNodes(ListNode head) {
       List<Integer> list=new ArrayList<>();
       while(head!=null)
       {
        list.add(head.val);
        head=head.next;
       } 
       Stack<Integer> st=new Stack<Integer>();
       int res[]=new int[list.size()];
       for(int i=list.size()-1;i>=0;i--)
       {
        while(!st.isEmpty() && list.get(i)>=st.peek())
        {
            st.pop();
        }
        if(!st.isEmpty())
        {
            res[i]=st.peek();
        }
        st.push(list.get(i));
       }
       return res;
    }
}