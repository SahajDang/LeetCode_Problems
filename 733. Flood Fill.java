class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        if(currentColor == color){
            return image;
        }
        // Color is different
        dfs(image, sr, sc, color, currentColor);
        return image;
    }
    void dfs(int[][] image, int sr, int sc, int newColor, int orgColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != orgColor){
            return ; // Backtracking start
        }
        image[sr][sc] = newColor; // mark as visited
        dfs(image, sr + 1, sc, newColor, orgColor);
        dfs(image, sr - 1, sc, newColor, orgColor);
        dfs(image, sr, sc + 1, newColor, orgColor);
        dfs(image, sr, sc - 1, newColor, orgColor);
    }
}
