class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode odd=head;
        ListNode even= head.next;
        ListNode evenHead=even;
       
       while (even != null && even.next != null) {
        odd.next  = even.next;  // step 1
        odd = odd.next;   // step 2

        even.next = odd.next;   // step 3
        even = even.next;  // step 4
    }
        odd.next = evenHead;
        return head;
        
    }
}