class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        ans[n-1]=0;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            int count=0;
            int value=arr[i];
            while(st.size()>0 && st.peek() <= value){
                st.pop();
                count++;
            }
            if(st.size()>0) count++;
            ans[i] = count;
            st.push(arr[i]);
        } 
        return ans;   
    }
}