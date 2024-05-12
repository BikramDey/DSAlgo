class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int count[] = new int[3];

        int l = 0;
        for (char ch : s.toCharArray()) {
            ++count[ch - 'a'];

            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                --count[s.charAt(l++) - 'a'];

            ans += l;
        }

        return ans;
    }
}