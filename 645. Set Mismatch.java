class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat = 0;
        int missing = 0;
        int n = nums.length;
        Arrays.sort(nums);
        // repeated element
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                repeat = nums[i];
                break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == repeat){
                nums[i] = 0;
                break;
            }
        }
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for(int i : nums){
            arrSum += i;
        }
        missing = sum - arrSum;

        return new int[] {repeat, missing} ;
    }
}
