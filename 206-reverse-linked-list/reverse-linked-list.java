
class Solution {
    public ListNode reverseList(ListNode head) {
       //we take a 3 list node prev,curr,after
       ListNode prev=null;
       ListNode after=null;
       ListNode curr=head;
       while(curr!=null){
        after=curr.next;// curr.next->after
        curr.next=prev;// null<-curr.next
        prev=curr;
        curr=after;
       
       }// previous is made hai fully list
       return prev;
    }
}