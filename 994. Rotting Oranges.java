class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int freshCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[] {i, j});
                }else if(grid[i][j] == 1){
                    freshCount++;
                }
            }
        }
        if(freshCount  == 0) return 0;
        int minutes = 0;
        int directions[][] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // All 4 directions
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isRotten = false;
            for(int i = 0; i < size; i++){
                int orangePosition[] = queue.poll();
                int r = orangePosition[0]; // row of rotten orange
                int c = orangePosition[1]; // col of rotten orange
                // Check in all directions
                for(int[] direction : directions){
                    int newDirectionRow = r + direction[0];
                    int newDirectionCol = c + direction[1];
                    if(newDirectionRow >= 0 && newDirectionRow < rows && newDirectionCol >= 0 && newDirectionCol < cols && grid[newDirectionRow][newDirectionCol] == 1){
                        grid[newDirectionRow][newDirectionCol] = 2;
                        // Fresh Orange converted to rotten;
                        queue.add(new int[] {newDirectionRow, newDirectionCol});
                        freshCount--;
                        isRotten = true;
                    }
                }
            }
            if(isRotten == true) minutes++;
        }
        return freshCount == 0 ? minutes : -1;
    }
}
