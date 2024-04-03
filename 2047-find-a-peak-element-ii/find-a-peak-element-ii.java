class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l = 0;
        int r = mat.length - 1;

        while (l < r) {
            int midRowIdx = (l + r) / 2;
            int midColIdx = findMaxColElement(mat[midRowIdx]);
            if (mat[midRowIdx][midColIdx] > mat[midRowIdx + 1][midColIdx])
                r = midRowIdx;
            else
                l = midRowIdx + 1;
        }
        return new int[] {l, findMaxColElement(mat[l])};

    }
    private int findMaxColElement(int[] row) {
        int maxIndex = 0;
        
        for (int i = 1; i < row.length; ++i) {
            if (row[maxIndex] < row[i]) {
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }
}