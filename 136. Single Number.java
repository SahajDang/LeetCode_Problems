class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new Hashmap<>();
        // Both HashMap and XOR
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }
}
