
class Solution {
    public ListNode reverseList(ListNode head) {
       //we take a 3 list node prev,curr,after
       ListNode prev=null;
       ListNode after=null;
       ListNode curr=head;
       while(curr!=null){
        after=curr.next;
        curr.next=prev;
        prev=curr;
        curr=after;
        
       }
       return prev;
      
    }
}