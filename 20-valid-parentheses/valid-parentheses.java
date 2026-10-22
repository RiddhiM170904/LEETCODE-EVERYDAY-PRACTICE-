class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(ch=='(' || ch=='{' || ch =='[') st.push(ch);
            else{
                if(!st.isEmpty() && ((st.peek()=='(' && ch==')') || (st.peek()=='{' && ch=='}') || (st.peek()=='[' && ch==']'))){
                    st.pop();
                }else{
                    if((ch==')' || ch=='}' || ch ==']') ) return false;
                }
            }
        }
        return st.isEmpty();
    }
}