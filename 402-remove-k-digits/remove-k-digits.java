class Solution {
    public String removeKdigits(String num, int k) {
        int l = num.length();
        if (l == k) {
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < l; i++) {
            char ch = num.charAt(i);
            while (!st.isEmpty() && k > 0 && ch < st.peek()) {
                st.pop();
                k -= 1;
            }
            st.push(ch);
        }
        while (k > 0) {
            st.pop();
            k -= 1;
        }
        if (st.isEmpty()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}