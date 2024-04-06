class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
            return s;

        String result = "";
        for(int i = 1; i<s.length(); i++){
            //odd
            int l = i, r = i;
            while(s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                if(l == -1 || r == s.length())
                    break;
            }
            String temp = s.substring(l+1, r);
            if(temp.length() > result.length())
                result = temp;

            //even
            l = i - 1; r = i;
            while(s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                if(l == -1 || r == s.length())
                    break;
            }
            temp = s.substring(l+1, r);
            if(temp.length() > result.length())
                result = temp;
        }
        return result;
    }
}