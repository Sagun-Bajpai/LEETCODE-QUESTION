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
    public ListNode rotateRight(ListNode head, int k) {
       
        ListNode temp=head;
        int length=1;
        if(head==null || head.next==null|| k==0) return head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }

        k=k%length;
          if(k==0) return head;
        ListNode newtemp=head;
      
        for(int i=1;i<length-k;i++){
            newtemp=newtemp.next;

        }
        ListNode newhead=newtemp.next;
        newtemp.next=null;
        temp.next=head;
        
        return newhead;


        
    }
}