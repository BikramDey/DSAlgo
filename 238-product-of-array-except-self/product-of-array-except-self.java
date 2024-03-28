class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, i;
        int ans[] = new int[n];
        ans[0] = 1;
        for(i=1; i<n;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(i=n-2; i>=0;i--){
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }
}