// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i = 0; i < nums.length - 1; i++){
        //     for(int j = nums.length - 1; j >= 0; j--){
        //         if(nums[i] == nums[j] && Math.abs(i - j) <= k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        
        return false;
    }
}
