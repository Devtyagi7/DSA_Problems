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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1=new ListNode(-1);
        ListNode d2=new ListNode(-1);
        ListNode t1=d1;
        ListNode t2=d2;
        ListNode t=head;
        if(head==null || head.next==null) return head;
        while(t!=null && t.next!=null){
            t1.next=t;
            t2.next=t.next;
            t1=t1.next;
            t2=t2.next;
            t=t.next.next;
        }
        if(t!=null){
            t1.next=t;
            t1=t1.next;
        }
        t2.next=null;
        t1.next=d2.next;
        return d1.next;
    }
}