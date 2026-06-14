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
            ListNode temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            return count;
        }
        
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=getSize(headA);
        int sizeB=getSize(headB);
        int diff=sizeA-sizeB;
        ListNode listA=headA;
        ListNode listB=headB;
        if(diff>0){
            for(int i=1;i<=diff;i++){
            listA=listA.next;
            }

        }
        else{
            for(int i=1;i<=Math.abs(diff);i++){
            listB=listB.next;

        }
        }
        while(listA!=listB){
            listA=listA.next;
            listB=listB.next;

        }
       return listA; 
    }
}