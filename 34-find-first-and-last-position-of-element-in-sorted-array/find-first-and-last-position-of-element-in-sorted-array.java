class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int arr[] = {-1, -1};
        while(l<=r){
            int m = l + (r-l)/2;
            if (nums[m] == target){
                arr[0] = m;
                r = m - 1;
            }
            else if (nums[m] > target) r = m - 1;
            else l = m + 1;
        }
        l = 0;
        r = n - 1;
        while(l<=r){
            int m = l + (r-l)/2;
            if (nums[m] == target){
                arr[1] = m;
                l = m + 1;
            }
            else if (nums[m] > target) r = m - 1;
            else l = m + 1;
        }
        return arr;
    }
}