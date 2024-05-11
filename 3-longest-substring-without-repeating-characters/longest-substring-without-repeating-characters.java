class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length(), j = -1;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                j = Math.max(j, map.get(ch));
            }

            result =  Math.max(result, i - j);
            map.put(ch, i);
        }
        
        return result;
    }
}