class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int lm[] = new int[n];
        int rm[] = new int[n];
        int l = 1, r = 1, i;
        lm[0] = 1;
        rm[n-1] = 1;
        for(i=1; i<n;i++){
            l*= nums[i-1];
            r*= nums[n-i];
            lm[i] = l;
            rm[n-i-1] = r;
        }
        int ans[] = new int[n];
        for(i=0; i<n;i++){
            ans[i] = lm[i] * rm[i];
        }
        return ans;

    }
}