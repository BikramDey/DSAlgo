class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int col[] = new int[c];
        int ans = 0;
        Arrays.fill(col, 0);
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(matrix[i][j] == '0')
                    col[j] = 0;
                else
                    col[j] = (i>0)? col[j]+1 : 1;
            }
            ans = Math.max(ans, largestRectangleArea(col));
        }
        return ans;
    }
    private int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        int[] prevMin = new int[n];
        int[] nextMin = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(prevMin, -1);
        Arrays.fill(nextMin, n);
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
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
            int c = (nextMin[i]-prevMin[i]-1) * heights[i];
            ans = Math.max(ans, c);
        }
        return ans;
    }
}