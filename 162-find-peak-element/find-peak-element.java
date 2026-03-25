class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int ans = -1;
        while(l<r){ 
            int mid = (r-l)/2 + l;
            if((mid==0 || nums[mid-1]<nums[mid]) && (mid==n-1 || nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(nums[mid] < nums[mid+1]){
                    l = mid + 1;
            }
            else {
                    r = mid - 1;
            }
        }
        return l;
    }
}