import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        
        int n = nums.length;
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i += 3) {
            int a = nums[i], b = nums[i + 1], c = nums[i + 2];
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            
            if (max - min > k) {
                return new int[0][0]; // Impossible to form valid groups
            }

            result.add(new int[]{a, b, c});
        }

        return result.toArray(new int[0][]); // Convert List to 2D array
    }
}
