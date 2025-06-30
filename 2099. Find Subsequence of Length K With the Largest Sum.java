class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Pair of (index, value)
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = i;
            pairs[i][1] = nums[i];
        }
        
        // Sort by value descending
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1]));
        
        // Take k largest elements
        int[][] selected = Arrays.copyOf(pairs, k);
        
        // Sort back by index to preserve order
        Arrays.sort(selected, Comparator.comparingInt(a -> a[0]));
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = selected[i][1];
        }
        
        return result;
    }
}
