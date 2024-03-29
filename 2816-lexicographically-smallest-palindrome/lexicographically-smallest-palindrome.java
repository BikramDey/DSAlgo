class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if (ch[i] != ch[n-i-1]) {
                ch[i] = ch[n-i-1] = ch[i] < ch[n-i-1] ? ch[i] : ch[n-i-1];
            }
        }
        return String.valueOf(ch);
    }
}