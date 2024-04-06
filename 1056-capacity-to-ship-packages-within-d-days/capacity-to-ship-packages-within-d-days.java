class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for (int weight : weights){
            l = Math.max(l, weight);
            r += weight;
        }

        while (l < r) {
        final int m = (l + r) / 2;
        if (isPossible(weights, m) <= days)
            r = m;
        else
            l = m + 1;
        }

        return l;
    }

    private int isPossible(int[] weights, int shipCapacity) {
        int days = 1;
        int capacity = 0;
        for (int weight : weights){
            if (capacity + weight > shipCapacity) {
                ++days;
                capacity = weight;
            } else {
                capacity += weight;
            }
        }

        return days;
    }
}