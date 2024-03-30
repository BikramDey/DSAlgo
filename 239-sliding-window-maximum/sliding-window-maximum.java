class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> maxQ = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            while(!maxQ.isEmpty() && maxQ.peekLast()<nums[i])
                maxQ.pollLast();

            maxQ.offerLast(nums[i]);

            if(i>=k && maxQ.peekFirst() == nums[i-k]){
                maxQ.pollFirst();
            }

            if(i>=k-1){
                ans[i-k+1] = maxQ.peekFirst();
            }
        }
        return ans;
    }
}