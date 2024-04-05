class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int c = 0;

        for (char ch : s.toCharArray())
        if (ch == '(')
            result = Math.max(result, ++c);
        else if (ch == ')')
            --c;

        return result;
    }
}