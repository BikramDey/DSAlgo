class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            if (nums[l] <= nums[r]) 
                return nums[l];

            int m = l + (r - l) / 2;
            if (m > 0 && nums[m] < nums[m - 1]) 
                return nums[m];

            if (nums[l] > nums[m]) 
                r = m - 1;
            else 
                l = m + 1;
        }
        return nums[l];
    }
}