class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = sumSubarrayMins(nums, '<') - sumSubarrayMins(nums, '>');
        return ans;
    }
    private long sumSubarrayMins(int[] arr, char ch) {
        int m = 1000000007;
        int n = arr.length;
        long ans = 0;
        int[] prev = new int[n];
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(prev, -1);
        Arrays.fill(next, n);
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && check(ch, arr[st.peek()], arr[i])){
                int ind = st.pop();
                next[ind] = i;
            }
            if(!st.isEmpty()){
                prev[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = 0; i<n; i++){
            ans += (long)(i - prev[i]) * (next[i] - i) * arr[i];
        }
        return ans;
    }
    private boolean check(char ch, int a, int b){
        if(ch == '>')
            return a>b;
        else
            return a<b;
    }
}