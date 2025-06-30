class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums); 

        int low = 0;
        int high = nums[nums.length - 1] - nums[0];

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFormPpairs(nums, p, mid)) {
                high = mid; 
            } else {
                low = mid + 1; 
            }
        }

        return low;
    }

    private boolean canFormPpairs(int[] nums, int p, int maxDiff) {
        int count = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }

        return count >= p;
    }
}
