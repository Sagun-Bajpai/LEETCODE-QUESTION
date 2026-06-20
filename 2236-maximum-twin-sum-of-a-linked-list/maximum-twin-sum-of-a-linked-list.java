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
    public static ListNode recursiveReverse(ListNode head){
        ListNode temp=head;
        if(temp==null || temp.next==null){
            return temp;
        }
       ListNode newhead =recursiveReverse(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return newhead;
    }
    
    public int pairSum(ListNode head) {
        //find left mid
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tempRev=recursiveReverse(slow.next);
        slow.next=tempRev;
        ListNode p1=head;
        ListNode p2=tempRev;
        int maxSum=Integer.MIN_VALUE;
        while(p2!=null){
            int sum=p1.val+p2.val;
            if(sum>=maxSum){
                maxSum=sum;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return maxSum; 
    }
}