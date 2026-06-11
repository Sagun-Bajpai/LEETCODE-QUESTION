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
    //helper function  fine size
    public int getSize(ListNode head){
            int count=0;
            ListNode curr=head;
            while(curr!=null){
                count++;
                curr=curr.next;
            }
            return count;
        }
        
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=getSize(headA);
        int size2=getSize(headB);
        ListNode temp1=headA;
        ListNode temp2=headB;
        int diff=size1-size2;
        if(diff>0){
            for(int i=1;i<=diff;i++){
                temp1=temp1.next;
            }
        }
        else{
            for(int i=1;i<=Math.abs(diff);i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}