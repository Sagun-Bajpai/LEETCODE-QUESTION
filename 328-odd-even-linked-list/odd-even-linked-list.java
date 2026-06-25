class Solution {
    public ListNode oddEvenList(ListNode head) {
      ListNode even=new ListNode(0);
      ListNode tempe=even;
      ListNode odd=new ListNode(0);
      ListNode tempo=odd;
      ListNode temp=head;
      while(temp!=null){
        tempo.next=temp;
        tempo=temp;
        temp=temp.next;
        
        tempe.next=temp;
        tempe=temp;
        if(temp!=null) temp=temp.next; 
      }
       tempo.next=even.next;
       even.next=null;
      return odd.next;


          
    }
}