class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashing = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!hashing.add(nums[i]))
                return true;
        }    
        return false;
    }
}