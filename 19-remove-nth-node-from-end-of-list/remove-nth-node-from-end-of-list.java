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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;

        ListNode temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        int r = c - n;
        if(r == 0)
            return head.next;
        temp = head.next;
        ListNode temp2 = head;

        while(r-->1){
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp2.next = temp.next;
        return head;
    }
}