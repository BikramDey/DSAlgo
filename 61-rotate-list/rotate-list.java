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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode r = head;
        int l = 1;
        for (; r.next != null; r = r.next)
            l++;
        
        r.next = head;
        l = l - k%l;
        r = head;
        while(l-->1){
            r = r.next;
        }
        ListNode newHead = r.next;
        r.next = null;
        return newHead;
    }
}