class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //best approach
        if(lists.length==0) return null;
        ArrayList<ListNode> arr1=new ArrayList<>();
        ArrayList<ListNode> arr2=new ArrayList<>();
        for(ListNode node:lists){
            arr1.add(node);
        }
        while(arr1.size()+arr2.size()>1){
            while(arr1.size()>=2){
                ListNode a=arr1.get(arr1.size()-1);
                arr1.remove(arr1.size()-1);
                ListNode b=arr1.get(arr1.size()-1);
                arr1.remove(arr1.size()-1);
                ListNode c=merge(a,b);
                arr2.add(c);
            }
            if(arr1.size()==1){
                arr2.add(arr1.get(0));
                arr1.remove(0);
            }
            while(arr2.size()>=2){
                ListNode a=arr2.get(arr2.size()-1);
                arr2.remove(arr2.size()-1);
                ListNode b=arr2.get(arr2.size()-1);
                arr2.remove(arr2.size()-1);
                ListNode c=merge(a,b);
                arr1.add(c);
            }
            if(arr2.size()==1){
                arr1.add(arr2.get(0));
                arr2.remove(0);
            }
        }    
        if(arr1.size()==0) return arr2.get(0);
        else return arr1.get(0);
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

    //     if(lists.length==0) return null;
    //     ArrayList<ListNode> list=new ArrayList<>();
    //     for(ListNode node:lists){
    //         list.add(node);
    //     }
    //     while(list.size()>1){
    //         ListNode a=list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         ListNode b=list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         ListNode c=merge(a,b);
    //         list.add(c);
    //     }
    //     return list.get(0);
    // }
    // ListNode merge(ListNode head1, ListNode head2){
    //     ListNode dummy=new ListNode(-1);
    //     ListNode i=dummy;
    //     ListNode j=head1;
    //     ListNode k=head2;
    //     while(j!=null && k!=null){
    //         if(j.val<k.val){
    //             i.next=j;
    //             i=i.next;
    //             j=j.next;
    //         }else{
    //             i.next=k;
    //             i=i.next;
    //             k=k.next;
    //         }
    //     }
    //     if(j!=null) i.next=j;
    //     else i.next=k;
    //     return dummy.next;
    //}
    //}