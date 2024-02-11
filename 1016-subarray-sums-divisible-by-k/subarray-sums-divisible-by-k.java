class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int r[] = new int[k];
        int c=0;
        int prefixSum=0;
        r[0]=1;
        for(int i = 0; i<nums.length; i++){
            prefixSum = (prefixSum + nums[i]%k + k)%k;
            c += r[prefixSum];
            r[prefixSum]++;
        }
        return c;
    }
}