class Solution {
    public int maxProfit(int[] prices) {
        int maxdiff = 0;
        int n = prices.length;
        int max = prices[n-1];
        for(int i=n-1; i>=0;i--){
            max = Math.max(max, prices[i]);
            if(max-prices[i]>maxdiff)
                maxdiff = max-prices[i];
        }
        return maxdiff;
    }
}