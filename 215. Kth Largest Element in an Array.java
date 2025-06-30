class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int value = 0;
        int n = nums.length;
        if(n == 1) return nums[0];
        for(int i = nums.length - 1; i >= 0 ; i--){
            if(n - i == k){
                value = nums[i];
                break;
            }
        }
        return value;
    }
}
