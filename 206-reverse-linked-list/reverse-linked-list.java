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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;

        ListNode t1=head;
        ListNode t2=null;
        while(t1!=null){
            ListNode t3=new ListNode(t1.val);
            t3.next=t2;
            t2=t3;
            t1=t1.next;
        }
        return t2;
    }
}