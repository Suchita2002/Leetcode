class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        // if same color already
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    public void dfs(int[][] image, int r, int c,
                    int originalColor, int color) {

        // boundary check
        if (r < 0 || c < 0 ||
            r >= image.length ||
            c >= image[0].length) {
            return;
        }

        // different color
        if (image[r][c] != originalColor) {
            return;
        }

        // fill new color
        image[r][c] = color;

        // 4 directions
        dfs(image, r + 1, c, originalColor, color); // down
        dfs(image, r - 1, c, originalColor, color); // up
        dfs(image, r, c + 1, originalColor, color); // right
        dfs(image, r, c - 1, originalColor, color); // left
    }
}