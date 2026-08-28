class Solution {
    public ListNode reverseList(ListNode head) {


        //Iterative way (Best Method)
        // ListNode fwd=null;
        // ListNode prev=null;
        // ListNode curr=head;
        // while(curr!=null){
        //     fwd=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=fwd;
        // }
        // return prev;
        
        //recursive method
        if(head==null || head.next==null) return head;
        ListNode a=head.next;
        head.next=null;
        ListNode b=reverseList(a);
        a.next=head;
        return b;

        //using arraylist
        // if(head==null) return null;
        // ArrayList<ListNode> arr=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int n=arr.size();
        // for(int i=n-1; i>=1; i--){
        //     arr.get(i).next=arr.get(i-1);
        // }
        // arr.get(0).next=null;
        // return arr.get(n-1);
    }
}