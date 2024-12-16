class Solution {
    public int sumSubarrayMins(int[] arr) {
        int m = 1000000007;
        int n = arr.length;
        long ans = 0;
        int[] prevMin = new int[n];
        int[] nextMin = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(prevMin, -1);
        Arrays.fill(nextMin, n);
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                int ind = st.pop();
                nextMin[ind] = i;
            }
            if(!st.isEmpty()){
                prevMin[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = 0; i<n; i++){
            ans += (long)(i - prevMin[i]) * (nextMin[i] - i) % m * arr[i] % m;
            ans %= m;
        }
        return (int)ans;
    }
}