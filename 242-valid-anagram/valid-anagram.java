class Solution {
    public boolean isAnagram(String s, String t) {
        int fq[] = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        int i;
        for(i=0;i<s.length();i++){
            fq[s.charAt(i)-97]++;
        }
        for(i=0;i<t.length();i++){
            fq[t.charAt(i)-97]--;
            if(fq[t.charAt(i)-97]<0)
                return false;
        }
        return true;
    }
}