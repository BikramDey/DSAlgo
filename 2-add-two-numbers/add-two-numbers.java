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
        ListNode r = new ListNode(0);
        ListNode end = r;
        int c = 0;
        while(l1!=null || l2!=null || c>0){
            if(l1!=null){
                c+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                c+=l2.val;
                l2=l2.next;
            }
            end.next = new ListNode(c%10);
            c/=10;
            end = end.next;
        }
        return r.next;
    }
}