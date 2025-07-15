class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                total += hammingDistance(nums[i], nums[j]);
            }
        }
        return total;
    }
    int hammingDistance(int x, int y) {
        int num = x ^ y;
        return Integer.bitCount(num);
    }
}
