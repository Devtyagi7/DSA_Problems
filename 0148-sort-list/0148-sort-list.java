class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head=sortList(head);
        head2=sortList(head2);
        return merge(head,head2);
    }
    public ListNode merge(ListNode head,ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        ListNode i=head;
        ListNode j=head2;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next=i;
                k=k.next;
                i=i.next;
            }else{
                k.next=j;
                k=k.next;
                j=j.next;
            }
        }
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }
}