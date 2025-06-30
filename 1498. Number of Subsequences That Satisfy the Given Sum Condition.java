class Solution {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1_000_000_007;
        Arrays.sort(nums);
        int[] pow2 = new int[nums.length];
        pow2[0] = 1;
        int count = 0;

        for(int i = 1; i < nums.length; i++){
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
        if(nums.length == 1 && nums[0] == target) return 0;
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            if((nums[left] + nums[right]) <= target){
                count = (count + pow2[right - left]) % MOD;
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}
