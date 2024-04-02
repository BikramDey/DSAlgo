class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int c = 0;
        String result = "";
        for(int i = 0; i<n ; i++){
            char ch = s.charAt(i);
            if (ch == '(') {
                if (++c > 1)
                    result += ch;
            } else if (--c > 0) { 
                result += ch;
            }
        }
        
        return result;
    }
}