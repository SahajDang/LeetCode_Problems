class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        // Primary Diagonal
        for(int i = 0; i < n; i++){
            // Primary Diagonal
            sum += mat[i][i];
            // Secondary Diagonal
            sum += mat[i][n - i - 1];
            // Odd Size Matrix
        }
        if(n % 2 == 1){
                sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
