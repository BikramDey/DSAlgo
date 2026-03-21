class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() == 0)
            return "";
        // String Approach
        // int l = s.length();
        // int index = 0, c = 0;
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i<l; i++){
        //     char ch = s.charAt(i);
        //     if(ch == '(')
        //         c++;
        //     if(ch == ')')
        //         c--;

        //     if(c==0){
        //         sb.append(s.substring(index+1, i));
        //         index = i+1;
        //     }
        // }
        // return sb.toString();

        // Stack Approach
        // Stack<Character> stack = new Stack<>();
        // StringBuilder sb = new StringBuilder();
        // for(char ch : s.toCharArray()){
        //     if(ch == '('){
        //         stack.push(ch);
        //         if (stack.size() > 1) 
        //             sb.append('(');
        //     }
        //     if(ch == ')'){
        //         if (stack.size() > 1) 
        //             sb.append(')');
        //         stack.pop();
        //     }
        // }
        // return sb.toString();

        // More Simpler Stack Approach
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                c++;
                if (c > 1) 
                    sb.append('(');
            }
            if(ch == ')'){
                if (c > 1) 
                    sb.append(')');
                c--;
            }
        }
        return sb.toString();
    }
}