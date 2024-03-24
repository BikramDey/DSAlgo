class Solution {
    public int majorityElement(int[] nums) {
        int i, c = 1, val = nums[0];
        int n = nums.length;
        for(i = 1; i<n; i++){
            if(nums[i] == val)
                c++;
            else
                c--;

            if(c==0){
                val = nums[i];
                c = 1;
            }
        }
        return val;
    }
}