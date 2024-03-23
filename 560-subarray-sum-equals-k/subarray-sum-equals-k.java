class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, c = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
          sum += nums[i];
          
          if (sum == k)
              c++;

          if (map.containsKey(sum - k)) {
               c+= map.get(sum - k);
          }
          if (map.containsKey(sum)) {
              map.put(sum, map.get(sum) + 1);
          }else{
            map.put(sum, 1);
          }
        }
        
        return c;
    }
}