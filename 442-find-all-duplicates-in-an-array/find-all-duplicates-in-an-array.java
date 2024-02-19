class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length == 1)
            return new ArrayList<>();
            
        List<Integer> result = new ArrayList<>();
        for(int i : nums){
            nums[Math.abs(i)-1] *= -1;
            if(nums[Math.abs(i)-1]>0)
                result.add(Math.abs(i));
        }
        return result;
    }
}