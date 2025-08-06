class Solution {
    public boolean isPalindrome(String s) {
        // s=s.toLowerCase();
        // int n=s.length();
        // int i;
        // String t="";
        // for(i=0;i<n;i++){
        //     if(Character.isLetterOrDigit(s.charAt(i)))
        //         t=t+s.charAt(i);
        // }
        // int k=t.length();
        // if(k==0){
        //     return true;
        // }
        // for(i=0;i<=k/2;i++){
        //     if(t.charAt(i)!=t.charAt(k-1-i))
        //         return false;
        // }
        // return true;
        // O(n) S(n)

        // O(n) S(1)
        s=s.toLowerCase();
        int j=s.length()-1;
        int i=0;
        while(i<j){
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            if(!Character.isLetterOrDigit(chi))
                i++;

            else if(!Character.isLetterOrDigit(chj))
                j--;

            else if(chi == chj){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}