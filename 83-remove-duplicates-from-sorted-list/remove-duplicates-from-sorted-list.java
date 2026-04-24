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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> result= new HashSet<>();
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            if(result.contains(curr.val)){
                prev.next=curr.next;//we check duplicate then skip
            }
            else{
                result.add(curr.val);//if value not duplicate then add in set
                prev=curr;

            }
            curr=curr.next;
            
        }
        return head;

    }
}