class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int p = 1, s = 1, max = 0;
        for(int i=0;i<n;i++){
            p *= nums[i];
            s *= nums[n-i-1];
            
            max = Math.max(max, Math.max(p, s));

            if(p == 0)
                p = 1;
            if(s == 0)
                s = 1;
        }
        return max;
    }
}