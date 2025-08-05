class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxv = 0, maxc = 0;
        for (Character ch : map.keySet()) {
            int temp = map.get(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                maxv = Math.max(maxv, temp);
            else
                maxc = Math.max(maxc, temp);
        }
        return maxv + maxc;
    }
}