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
    public static int getSize(ListNode head){
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
       int  size2=getSize(headB);
        int diff=size1-size2;
        if(diff>0){
            for(int i=0;i<diff;i++){
                headA=headA.next;
            }
        }
        else{
            for(int i=0;i<Math.abs(diff);i++){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){

            if(headA==headB){
                return headA;
            }
            else{
                headA=headA.next;
                headB=headB.next;
            }
        }
        return headA;
    }
}