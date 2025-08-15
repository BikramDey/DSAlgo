class Solution {
    public String removeOuterParentheses(String s) {
        // Stack stack = new Stack<>();
        // StringBuilder ans = new StringBuilder();
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '(') {
        //         stack.push('(');
        //         if (stack.size() > 1) ans.append('(');
        //     } else {
        //         if (stack.size() > 1) ans.append(')');
        //         stack.pop();
        //     }
        // }
        // return ans.toString();
        // Stack Approach

        int c = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c++;
                if (c > 1) ans.append('(');
            } else {
                if (c > 1) ans.append(')');
                c--;
            }
        }
        return ans.toString();
    }
}