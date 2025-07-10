class Solution {
    // TC - O(rows * cols) (m * n) SC - O(m * n)
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i < rows; i++){ 
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){ // is there any land
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid, int i, int j){
        // Base case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return ; // Backtracking start
        }
        // Mark the current cell as visited
        grid[i][j] = '0'; // Land is synced, mark as visited
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
