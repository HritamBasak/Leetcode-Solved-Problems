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
    public boolean isPalindrome(ListNode head) 
    {
    ListNode copy = new ListNode(head.val);
    ListNode tempCopy = copy;
    ListNode tempOriginal = head.next;

    while (tempOriginal != null) 
    {
    tempCopy.next = new ListNode(tempOriginal.val);
    tempCopy = tempCopy.next;
    tempOriginal = tempOriginal.next;
    }

    // Now reverse the original list
    ListNode temp = head;
    ListNode prev = null;
    while (temp != null) 
    {
    ListNode cur = temp.next;
    temp.next = prev;
    prev = temp;
    temp = cur;
    }

    // Compare the copied list with the reversed list
    while (prev != null && copy != null) 
    {
    System.out.println(copy.val + " " + prev.val);
    if (copy.val != prev.val)
        return false;
    copy = copy.next;
    prev = prev.next;
    }   
    return true;

    }
}