class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for(int i = 1; i < nums.length; i++){
            sum = sum + nums[i];
            sum = Math.max(sum, nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
