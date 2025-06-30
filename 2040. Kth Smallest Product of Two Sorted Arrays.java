class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        long left = -1_000_000_000L * 1_000_000_000L;
        long right = 1_000_000_000L * 1_000_000_000L;

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (countLessEqual(nums1, nums2, mid) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private long countLessEqual(int[] nums1, int[] nums2, long x) {
        long count = 0;
        for (int num : nums1) {
            if (num == 0) {
                if (x >= 0) count += nums2.length;
            } else if (num > 0) {
                // Count how many nums2[j] <= x / num
                int lo = 0, hi = nums2.length;
                while (lo < hi) {
                    int mid = (lo + hi) / 2;
                    if ((long) num * nums2[mid] <= x) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                count += lo;
            } else {
                // num < 0 → product decreases as nums2 increases
                int lo = 0, hi = nums2.length;
                while (lo < hi) {
                    int mid = (lo + hi) / 2;
                    if ((long) num * nums2[mid] <= x) {
                        hi = mid;
                    } else {
                        lo = mid + 1;
                    }
                }
                count += nums2.length - lo;
            }
        }
        return count;
    }
}
