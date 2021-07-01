// TC : O(N)
// SC : O(1)


class Solution {

   public void reorderList(ListNode head) {

       if(head==null || head.next==null) return;

       ListNode slow=head,fast=head;

       while(fast.next!=null && fast.next.next!=null){ // TO find middle element - found at slow pointer

           slow=slow.next;

           fast=fast.next.next;

       }

       fast=slow.next;

       ListNode prev=null;

       slow.next=null;

       while(fast!=null){ // Reverse a linked list after middle node

           ListNode next=fast.next;

           fast.next=prev;

           prev=fast;

           fast=next;

       }

       fast=prev;

       ListNode next;

       while(head!=null && fast!=null){

           next=head.next;

           head.next=fast;

           fast=fast.next;

           (head.next).next=next;

           head=next;

       }

       }

   }
