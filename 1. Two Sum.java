class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<=(nums.length-1);i++){
        //     for(int j=i+1;j<nums.length;j++){
        //     if(nums[i]+nums[j]==target){
        //         return new int[]{i,j};
        //     }
        // }
        // }

        // return new int[]{};

        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;

    }

}
