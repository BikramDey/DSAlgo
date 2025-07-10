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
        if(head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode current = slow;
        ListNode previous = null;
        ListNode temp = null;
        while(current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        ListNode l1 = head;
        ListNode l2 = previous;
        while(l2 != null){
            if(l2.val != l1.val)
                return false;

            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}