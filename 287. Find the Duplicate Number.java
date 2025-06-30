class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int duplicate = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                duplicate = nums[i];
                break;
            }
        }
        return duplicate;
    }
}
