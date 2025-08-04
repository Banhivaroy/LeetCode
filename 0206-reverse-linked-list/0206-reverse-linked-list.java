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
    public ListNode rev(ListNode head){
        if(head.next == null) return head;
        ListNode newHead = rev(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode ans = rev(head);
        return ans;
    }
}