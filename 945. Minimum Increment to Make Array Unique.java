class Solution {
    public int minIncrementForUnique(int[] nums) {
        // Arrays.sort(nums);
        // int moves = 0;
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] <= nums[i - 1]){
        //         int increment = nums[i - 1] - nums[i] + 1;
        //         nums[i] += increment;
        //         moves += increment;
        //     }
        // }
        // return moves;

        // int moves = 0;
        // for(int i = 0; i < nums.length; i++){
        //     Arrays.sort(nums);
        //     for(int j = i + 1 ; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             nums[j]++;
        //             moves++;
        //         }
        //     }
        // }
        // return moves;


        Arrays.sort(nums);
        int moves = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                int gap = nums[i - 1] + 1 - nums[i];
                nums[i] += gap;
                moves += gap;
            }
        }
        return moves;
    }
}
