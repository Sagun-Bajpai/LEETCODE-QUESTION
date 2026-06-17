class Solution {
    public ListNode oddEvenList(ListNode head) {
      ListNode even=new ListNode(0);
          ListNode odd=new ListNode(0);
          ListNode tempE=even;
          ListNode tempO=odd;
          ListNode temp=head;
          while(temp!=null){
            tempO.next=temp;//link the node
            tempO=temp;
            temp=temp.next;
           if(temp==null)  break;
            tempE.next=temp;//link the node
            tempE=temp;
            temp=temp.next;
            
        }
       
       tempO.next=even.next;
        tempE.next=null;
        return odd.next;
            

    }
}