class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int n=nums.length;
        int maxSum = nums[0];
        // Kadane's Algorithm
        for(int i=1;i<n;i++){
            maxSoFar=Math.max(nums[i], maxSoFar+nums[i]);
            if(maxSum<maxSoFar){
                maxSum=maxSoFar;
            }
            if(maxSoFar<0)
                maxSoFar=0;
        }
        return maxSum;
    }
}