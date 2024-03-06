class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length-1;
        int arr[] = new int[l+1];
        arr[l] = 0;
        if(l==0){
            return arr;
        }

        Stack<Integer> st = new Stack<>();

        for(int i=l; i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) {
                arr[i] = 0;
            } else{
                arr[i] = st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}