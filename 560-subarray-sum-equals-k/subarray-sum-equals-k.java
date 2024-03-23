class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, c = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum == k)
                c++;

            if (map.containsKey(sum - k)) {
                c += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return c;
    }
}