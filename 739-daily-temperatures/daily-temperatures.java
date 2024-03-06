class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1){
            return new int[]{0};
        }
        int l = temperatures.length;
        int arr[] = new int[l];

        Stack<Integer> st = new Stack<>();

        for(int i=l-1; i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()) {
                arr[i] = st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}