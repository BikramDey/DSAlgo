class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
        return 1;
        int c = nums[0], index = 0;
        for(int i=1; i<nums.length; i++){
            if(c != nums[i]){
                c = nums[i];
                index++;
                nums[index] = c;
            }
        }
        return index+1;
    }
}