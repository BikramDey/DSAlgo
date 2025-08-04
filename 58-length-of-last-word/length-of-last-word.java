class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int c = 0;
        while(n>=0){
            if(s.charAt(n)!= ' ')
                c++;
            else if(c>0)
                break;
            n--;
        }
        return c;
    }
}