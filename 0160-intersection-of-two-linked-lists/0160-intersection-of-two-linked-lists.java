/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0,countB = 0;
        while(tempA != null){
            countA++;
            tempA = tempA.next;
        }
        while(tempB != null){
            countB++;
            tempB = tempB.next;
        }
        int x = Math.abs(countA-countB);
        tempA = headA;
        tempB = headB;
        if(countA > countB){
            for(int i=1;i<=x;i++){
                tempA = tempA.next;
            }
            } else{
            for(int i=1;i<=x;i++){
                tempB = tempB.next;
            }
            }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}