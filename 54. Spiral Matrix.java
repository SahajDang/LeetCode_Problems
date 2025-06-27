class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        // Left to Right
        // Top to Bottom
        // Right to Left
        // Left to one up
        // Left to right one
        // Maintain the index
        int top = 0;
        int bottom = m - 1;

        int left = 0;
        int right = n - 1;

        while(top <= bottom && left <= right){
            // Step-1
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }

            // Shrink the Row
            top++;

            // Step-2
            for(int j = top; j <= bottom; j++){
                result.add(matrix[j][right]);
            }

            // Shrink the right
            right--;

            // Step-3
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                    }
            
            // Shrink the bottom
            bottom--;
            }
            // Step-4
            if(left <= right){
                for(int j = bottom; j >= top; j--){
                    result.add(matrix[j][left]);
                }
            left++;
            }
        }
        return result;
    }
}
