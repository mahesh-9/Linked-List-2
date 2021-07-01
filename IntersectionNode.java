// TC : O(N)
// SC : O(1)

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<>();
        while(headA != null){
            s.add(headA);
            headA = headA.next;
        }
        
        while( headB != null){
            if(s.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
