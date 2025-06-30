class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = 0;
        for(int i = 0; i < nums.length; i++){
            int diff = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    diff = nums[j] - nums[i];
                }
                maxDiff = Math.max(diff, maxDiff);
            }
        }
        int d = maxDiff;
        if(d > 0 || d < 0){
            return d;
        }else{
            return -1;
        }
    }
}
