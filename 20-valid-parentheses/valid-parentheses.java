class Solution {
    public boolean isValid(String s) {
        int l = s.length();
        int i=0;
        Stack<Character> st = new Stack<>();
        while(i<l){
            char ch = s.charAt(i);
            if(ch == '(')
                st.push(')');
            else if ( ch == '{')
                st.push('}');
            else if( ch == '[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=ch)
                return false;

            i++;
        }
        return st.isEmpty();
    }
}