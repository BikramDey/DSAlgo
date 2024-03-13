class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch = s.toCharArray();
        for(int i=0 , j=ch.length - 1; i<j; i++, j--){
            if (ch[i] != ch[j]) {
                ch[i] = ch[j] = ch[i] < ch[j] ? ch[i] : ch[j];
            }
        }
        return String.valueOf(ch);
    }
}