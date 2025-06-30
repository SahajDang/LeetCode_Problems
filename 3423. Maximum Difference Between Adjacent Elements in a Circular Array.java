// class Solution {
//     public int maxAdjacentDistance(int[] nums) {
//         int n = nums.length;
//         int maxdiff = 0;
//         for(int i = 0; i < n - 1; i++){
//             for(int j = i + 1; j < n; j++){
//                 int diff = Math.abs(nums[i] - nums[j]);
//                 maxdiff = Math.max(diff, maxdiff);
//             }
//         }
//         return maxdiff;

//         // int maxDiff = 0;
//         // for (int i = 1; i < nums.length; i++) {
//         //     maxDiff = Math.max(maxDiff, Math.abs(nums[i] - nums[i - 1]));
//         // }
//         // return maxDiff;
//     }
// }

class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int nextIndex = (i + 1) % n;  // circular wrap
            int diff = Math.abs(nums[i] - nums[nextIndex]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}
