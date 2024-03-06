class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length-1;
        int arr[] = new int[l+1];
        arr[l] = 0;
        if(l==0){
            return arr;
        }

        Stack<Integer> st = new Stack<>();
        st.push(l);

        for(int i=l-1; i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty() && temperatures[i]<temperatures[st.peek()]){
                arr[i] = st.peek()-i;
            } else{
                arr[i] = 0;
            }
            st.push(i);
        }
        return arr;
    }
}