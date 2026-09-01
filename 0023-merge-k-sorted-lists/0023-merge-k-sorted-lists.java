class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> list=new ArrayList<>();
        for(ListNode node:lists){
            list.add(node);
        }
        while(list.size()>1){
            ListNode a=list.get(list.size()-1);
            list.remove(list.size()-1);
            ListNode b=list.get(list.size()-1);
            list.remove(list.size()-1);
            ListNode c=merge(a,b);
            list.add(c);
        }
        return list.get(0);
    }
    ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode i=dummy;
        ListNode j=head1;
        ListNode k=head2;
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
        if(j!=null) i.next=j;
        else i.next=k;
        return dummy.next;
    }
}