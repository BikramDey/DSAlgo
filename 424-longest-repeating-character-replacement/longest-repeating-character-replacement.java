class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        int maxCount = 0;
        int fq[] = new int[26];

        for (int l = 0, r = 0; r < s.length(); ++r) {
        maxCount = Math.max(maxCount, ++fq[s.charAt(r) - 'A']);
        while (maxCount + k < r - l + 1)
            --fq[s.charAt(l++) - 'A'];
        result = Math.max(result, r - l + 1);
        }

        return result;
    }
}