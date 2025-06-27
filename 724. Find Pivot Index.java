class Solution {
    public int pivotIndex(int[] nums) {
        // int sum = 0;
        // for(int i :  nums){
        //     sum = sum + i;
        // }
        // int leftSum = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int rightSum = sum - leftSum - nums[i];
        //     if(leftSum == rightSum){
        //         return i;
        //     }
        //     leftSum = leftSum + nums[i];
        // }
        // return -1;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j >= 0; j--){
                sum1 += nums[i];
                sum2 += nums[j];
                if(sum1 == sum2){
                    return i;
                }
            }
        }
        return -1;
    }
}
