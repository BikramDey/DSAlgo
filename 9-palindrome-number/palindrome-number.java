class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int t = x;
        int r = 0;
        while(t>0){
            r = r*10 + t%10;
            t /= 10;
        }
        return r==x;
    }
}