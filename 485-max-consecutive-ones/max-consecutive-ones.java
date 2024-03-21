class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int len = 0;
        int n = nums.length;
        for (int i=0; i<n; i++){
            if (nums[i] == 1){
                ans = Math.max(ans, ++len);
            }
            else
                len = 0;
        }

        return ans;
    }
}