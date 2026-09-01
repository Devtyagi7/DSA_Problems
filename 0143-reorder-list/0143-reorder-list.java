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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null, frwd=null;
        while(curr!=null){
            frwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frwd;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second.next != null){
            ListNode fnext=first.next;
            ListNode snext=second.next;

            first.next=second;
            second.next=fnext;

            first=fnext;
            second=snext;
        }
        return;
    }
}