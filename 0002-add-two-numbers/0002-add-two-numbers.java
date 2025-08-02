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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(-1);
        ListNode ans=res;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            // res.next=new ListNode(sum);
            carry=sum/10;//1
            sum=sum%10;//8
            res.next=new ListNode(sum);
            res=res.next;
            sum=carry;//1
        }
        if(sum==1) res.next=new ListNode(1);
        return ans.next;
    }
}