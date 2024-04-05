class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] sFreq = new int[256];
        int[] tFreq = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (sFreq[sChar] != tFreq[tChar]) {
                return false;
            }
            
            sFreq[sChar] = i + 1;
            tFreq[tChar] = i + 1;
        }
        
        return true;
    }
}