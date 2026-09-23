class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1; i<=k; i++){
            if(temp==null) return head;
            temp=temp.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1; i<=k; i++){
            ListNode frwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frwd;
        }
        head.next=reverseKGroup(curr,k);

        return prev;
    }
}