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
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        int carry = 0;
        
        ListNode result = addLists(l1, l2, carry);
        
        return reverseList(result);
    }
    private ListNode addLists(ListNode l1, ListNode l2, int c) {
        if(l1 == null && l2 == null && c==0){
            return null;
        }
        if(l1 != null){
            c += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            c += l2.val;
            l2 = l2.next;
        }
        ListNode current = new ListNode(c%10);
        current.next = addLists(l1, l2, c/10);
        return current;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode later = current.next;
            current.next = prev;
            prev = current;
            current = later;
        }
        return prev;
    }
}