class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> a = new ArrayList<>();
        int i, j;
        for (i = 0; i < (m + 1) / 2 && i < (n + 1) / 2; i++) {
            for (j = i; j < n - i; j++)
                a.add(matrix[i][j]);

            for (j = i + 1; j < m - i; j++)
                a.add(matrix[j][n - 1 - i]);

            for (j = n - 2 - i; j >= i && (m - 1 - i != i); j--)
                a.add(matrix[m - 1 - i][j]);

            for (j = m - 2 - i; j > i && (n - 1 - i != i); j--)
                a.add(matrix[j][i]);
        }

        return a;
    }
}