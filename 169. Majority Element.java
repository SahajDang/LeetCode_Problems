class Solution {
    public int majorityElement(int[] nums) {

        // Approach 3 - Boyer - Moore Voting Algo

        int count = 0;
        int majElement = 0;
        for(int num : nums){
            if(count == 0){
                majElement = num;
            }
            if(num == majElement){
                count++;
            }
            else{
                count--;

            }
        }
        return majElement;


        // Approach -2 Hashing
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = nums.length;
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        //     if(map.get(nums[i]) > n / 2){
        //         return nums[i];
        //     }
        // }

        // return -1;


        // Approach 1 - Brute Force Solution
        // int n = nums.length;
        // for(int i = 0; i < nums.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > n / 2){
        //         return nums[i];
        //     }
        // }
        // return -1;
    }
}
