class Solution {
    public int beautySum(String s) {
        int beauty = 0;
        int l = s.length();

        for (int i = 0; i < l; ++i) {
            int[] fq = new int[26];
            for (int j = i; j < l; ++j) {
                ++fq[s.charAt(j) - 'a'];
                int minFq = 1000, maxFq = 0;

                for (int k : fq) {
                    if (k > 0) {
                        minFq = Math.min(minFq, k);
                        maxFq = Math.max(maxFq, k);
                    }
                }
                beauty += maxFq - minFq;
            }
        }
        return beauty;
    }
}