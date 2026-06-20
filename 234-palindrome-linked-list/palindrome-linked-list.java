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
    //reverse method
    public static ListNode reverse(ListNode head){
        // ListNode temp=head;
        // if(temp==null) return null;
        // reverse(temp.next);
        // System.out.print(temp.val+" ");
        ListNode prev=null;
        ListNode after=null;
        ListNode curr=head;
        while(curr!=null){
            after= curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;

        }
        return prev;

    }
    public boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null) return true;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        ListNode p1=head;
        ListNode p2=temp;
        while(p2!=null){
            if(p1.val != p2.val){
            return false;
            }
            p1=p1.next;
            p2=p2.next;;
        }
        
        return true;
    }
}