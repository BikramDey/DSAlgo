class Solution {
    public boolean isValid(String s) {
        // Stack<Character> st = new Stack<>(); 
        // int c = 0;
        // for(char ch : s.toCharArray()){
        //     if(ch == '(' || ch=='{' || ch=='['){
        //         st.push(ch);
        //     }
        //     else if(ch == ')'){
        //         if(st.isEmpty() || st.pop()!='(')
        //             return false;
        //     }
        //     else if(ch == '}'){
        //         if(st.isEmpty() || st.pop()!='{')
        //             return false;
        //     }
        //     else if(ch == ']'){
        //         if(st.isEmpty() || st.pop()!='[')
        //             return false;
        //     }
        // }
        // return st.isEmpty();
        
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(')
                st.push(')');
            else if ( ch == '{')
                st.push('}');
            else if( ch == '[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=ch)
                return false;
        }
        return st.isEmpty();
    }
}