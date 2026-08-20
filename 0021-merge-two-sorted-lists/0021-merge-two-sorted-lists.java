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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode i=dummy;
        ListNode j=list1;
        ListNode k=list2;
        while(j!=null && k!=null){
            if(j.val<k.val){
                i.next=j;
                i=i.next;
                j=j.next;
            }else{
                i.next=k;
                i=i.next;
                k=k.next;
            }
        }
        if(j==null) i.next=k;
        else i.next=j;
        return dummy.next;
    }
}