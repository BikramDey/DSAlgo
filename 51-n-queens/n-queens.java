class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allPaths = new ArrayList<>();
        int[][] board = new int[n][n];
        solveQueens(board, n, 0, allPaths);
        return allPaths;
    }
    private void solveQueens(int[][] board, int n, int col, List<List<String>> allPaths) {
        if (col >= n) {
            allPaths.add(generateBoard(board));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(board, i, col, n)) {
                board[i][col] = 1;
                solveQueens(board, n, col + 1, allPaths);
                board[i][col] = 0;
            }
        }
    }

    private boolean isValid(int[][] board, int row, int col, int n) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1)
                return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }
        for (int i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

    private List<String> generateBoard(int[][] board) {
        List<String> solution = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int col : row) {
                sb.append(col == 1 ? 'Q' : '.');
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}