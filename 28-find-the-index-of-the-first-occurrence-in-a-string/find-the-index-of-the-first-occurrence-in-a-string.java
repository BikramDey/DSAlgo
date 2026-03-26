class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        int ls = needle.length(), lt = haystack.length();
        int i = 0, j = 0;
        while(j < lt){
            if(needle.charAt(0) == haystack.charAt(j)){
                String s = haystack.substring(j, Math.min(lt, j+ls));
                if(s.equalsIgnoreCase(needle))
                    return j;
            }
            j++;
        }
        return -1;
    }
}