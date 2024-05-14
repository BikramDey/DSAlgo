class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0, current = 0, result = 0;
        int j = 0, n = cardPoints.length;
        for(int i = 0; i < n; i++){
            total += cardPoints[i];
            if(i<n-k)
                current += cardPoints[i];
        }
        for(int i = n-k; i < n; i++){
            result = Math.max(result, total - current);
            current += cardPoints[i] - cardPoints[j++];
        }
        return Math.max(result, total - current);
    }
}