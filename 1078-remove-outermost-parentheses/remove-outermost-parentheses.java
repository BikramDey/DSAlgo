class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 0;

        for (char ch : s.toCharArray())
        if (ch == '(') {
            if (++c > 1)
                sb.append(ch);
        } else if (--c > 0) {
            sb.append(ch);
        }

        return sb.toString();
    }
}