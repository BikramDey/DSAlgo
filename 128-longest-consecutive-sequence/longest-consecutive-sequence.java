class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) 
            return 0;

        Set<Integer> set = new HashSet<>();
        for(int n : nums) 
            set.add(n);

        int result = 0;

        for (int num : nums) {
            if (set.contains(num - 1))
                continue;
            int length = 1;
            while (set.contains(++num))
                ++length;
            result = Math.max(result, length);
        }

        return result;
    }
}
