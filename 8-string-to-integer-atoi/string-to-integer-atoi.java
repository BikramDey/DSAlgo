class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        if (s.isEmpty())
            return 0;
        
        int sign = s.charAt(0) == '-'? -1 : 1;
        if(s.charAt(0) == '-' || s.charAt(0) == '+')
            s = s.substring(1);

        long a = 0;
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch))
                break;

            a = a*10 + (ch - '0');
            if(sign * a <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(sign * a >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }
        return sign * (int)a;
    }
}