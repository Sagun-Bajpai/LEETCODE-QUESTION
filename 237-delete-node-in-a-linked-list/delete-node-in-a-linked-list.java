/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }// esme listNode user define data type hai
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;//overwrite next ko curr me
        node.next=node.next.next;//connect krr rhe a.next->a.next.next
    }
}