class Solution {
    public boolean sameStyle(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;
        
    }
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{ // agr ch closing bracket hai
                if(st.size()==0) return false;
                char top=st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        if(st.size()==0) return true;
        else return false;
    }
}