class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i : nums){
            nums[Math.abs(i)-1] *= -1;
            if(nums[Math.abs(i)-1]>0)
                result.add(Math.abs(i));
        }
        return result;
    }
}