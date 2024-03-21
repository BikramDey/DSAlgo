class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int len = 0;

        for (int num : nums){
            if (num == 1)
                ans = Math.max(ans, ++len);
            else
                len = 0;
        }

        return ans;
    }
}