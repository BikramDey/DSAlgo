class Solution {
    public int sumSubarrayMins(int[] arr) {
        int kMod = 1_000_000_007;
        int n = arr.length;
        long ans = 0;
        int[] prevMin = new int[n];
        int[] nextMin = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(prevMin, -1);
        Arrays.fill(nextMin, n);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
                prevMin[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
                nextMin[i] = stack.isEmpty()? n : stack.peek();
            stack.push(i);
        }
        for (int i = 0; i < arr.length; ++i) {
            ans += (long) arr[i] * (i - prevMin[i]) * (nextMin[i] - i);
            ans %= kMod;
        }

        return (int) ans;

    }
}