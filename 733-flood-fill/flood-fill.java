class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
            return image;
        int c = 0;
        
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void dfs(int[][] image, int i, int j, int color, int current) {
    if (i < 0 || i == image.length || j < 0 || j == image[0].length)
      return;
    if (image[i][j] != current || image[i][j] == color)
      return;

    image[i][j] = color;
    dfs(image, i + 1, j, color, current);
    dfs(image, i - 1, j, color, current);
    dfs(image, i, j + 1, color, current);
    dfs(image, i, j - 1, color, current);
  }
}