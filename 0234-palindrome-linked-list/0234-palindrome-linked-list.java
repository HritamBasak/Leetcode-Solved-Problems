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
    public boolean isPalindrome(ListNode head) {
        ListNode prev=null;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        slow.next=null;
        while(curr!=null)
        {
            ListNode c=curr.next;
            curr.next=prev;
            prev=curr;
            curr=c;
        }
        while(head!=null && prev!=null)
        {
            if(head.val!=prev.val)
            return false;

            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}