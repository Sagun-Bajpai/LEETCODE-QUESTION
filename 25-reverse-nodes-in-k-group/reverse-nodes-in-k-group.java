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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node=head;
        int count=0;
        while(node!=null && count<k){
            node=node.next;
            count++;
        }
        if(count<k) return head;

        ListNode newhead=reverseKGroup(node,k);
        ListNode prev=newhead;
        ListNode curr=head;
        for (int i = 0; i < k; i++) {
            ListNode temp = curr.next; // save next node before breaking link
            curr.next = prev;          // reverse the pointer
            prev = curr;                // move prev forward
            curr = temp;                // move curr forward
        }

        return prev;
    }
}