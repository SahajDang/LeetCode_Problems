class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Step 1: Map each value in nums2 to its index
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int j = 0; j < nums2.length; j++) {
            valueToIndex.put(nums2[j], j);
        }

        // Step 2: Result array
        int[] ans = new int[nums1.length];

        // Step 3: For each value in nums1, search in nums2
        for (int i = 0; i < nums1.length; i++) {
            int key = nums1[i];
            int indexInNums2 = valueToIndex.get(key);
            int nextGreater = -1;

            for (int j = indexInNums2 + 1; j < nums2.length; j++) {
                if (nums2[j] > key) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            ans[i] = nextGreater;
        }
        return ans;
    }
}
