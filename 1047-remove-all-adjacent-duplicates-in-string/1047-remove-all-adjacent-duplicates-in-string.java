class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st1=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(st.size()==0) st.push(ch);
            else{
                char top=st.peek();
                if(ch!=top) st.push(ch);
                else st.pop(); 
            }
        }
        while(st.size()>0){
            st1.push(st.pop());
        }
        StringBuilder str=new StringBuilder();
        while(st1.size()>0){
            str.append(st1.pop());
        }
        return str.toString();
    }
}