/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int count1=0, count2=0;
        while(temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        int idx;
        if(count1>count2){
            idx=count1-count2;
            temp1=headA;
            temp2=headB;
            for(int i=1; i<=idx; i++){
                temp1=temp1.next;
            }
            while(temp2!=null){
                if(temp1==temp2) return temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        else{
            idx=count2-count1;
            temp2=headB;
            temp1=headA;
            for(int i=1; i<=idx; i++){
                temp2=temp2.next;
            }
            while(temp1!=null){
                if(temp1==temp2) return temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return null;
    }
}