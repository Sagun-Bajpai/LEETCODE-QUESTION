import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
       //we take a 3 list node prev,curr,after
       ListNode curr=head;
       Stack<Integer>st=new Stack<>();
       while(curr!=null){
        st.push(curr.val);
        curr=curr.next;
       }
       curr=head;
       while(curr!=null){
        curr.val=st.peek();
        st.pop();
        curr=curr.next;
       }
       return head;

    }
}