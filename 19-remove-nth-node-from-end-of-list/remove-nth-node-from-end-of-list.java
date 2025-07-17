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

        ListNode temp = new ListNode(-1);
        temp.next = head;
        while(n-->0){
            head = head.next;
        }
        
        ListNode current = temp;
        while(head!=null){
            head = head.next;
            current = current.next;
        }
        current.next = current.next.next;
        return temp.next;
    }
}