class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(isFound(board, word, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
    int directions[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    boolean isFound(char[][] board, String word, int row, int col){
        if(word.length() == 0) return true;

        if(row < 0 || col < 0 || col >= board[0].length || row >= board.length || board[row][col] != word.charAt(0)) return false; 
        board[row][col] = '#';
        boolean isMatch = false;
        for(int direction = 0; direction < directions.length; direction++){
            int nextRow = directions[direction][0];
            int nextCol = directions[direction][1];

            isMatch = isFound(board, word.substring(1), row + nextRow, col + nextCol);
            if(isMatch){
                break;
            }
        }
        board[row][col] = word.charAt(0);
        return isMatch;
    }
}
