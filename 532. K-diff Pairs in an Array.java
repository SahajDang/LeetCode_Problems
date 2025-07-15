class Solution {
    public int findPairs(int[] nums, int k) {
        List<int[]> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);
                    pairs.add(new int[]{a, b});
                }
            }
        }

        // Eliminate duplicates using Set<String>
        Set<String> unique = new HashSet<>();
        for (int[] pair : pairs) {
            unique.add(pair[0] + "," + pair[1]);
        }

        return unique.size();
    }
}
