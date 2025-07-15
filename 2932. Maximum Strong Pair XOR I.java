class Solution {
    public int maximumStrongPairXor(int[] nums) {
        List<int[]> pairs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) <= (Math.min(nums[i],nums[j]))){
                    pairs.add(new int[]{nums[i], nums[j]});
                }
            }
        }
        int max = 0;
        for (int i = 0; i < pairs.size(); i++) {
            int[] pair = pairs.get(i);
            int XOR = pair[0] ^ pair[1];
            max = Math.max(XOR, max);
        }
        return max;
    }
}
