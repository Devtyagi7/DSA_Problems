// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             arr.add(temp.val);
//             temp=temp.next;
//         }
//         int i=0, j=arr.size()-1;
//         while(i<j){
//             int a=arr.get(i), b=arr.get(j);
//             if(a!=b) return false;
//             i++; j--;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next, prev=null, frwd=null;
        while(curr!=null){
            frwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frwd;
        }
        ListNode temp=head;
        while(prev!=null){
            if(temp.val!=prev.val) return false;
            prev=prev.next;
            temp=temp.next;
        }
        return true;
    }
}