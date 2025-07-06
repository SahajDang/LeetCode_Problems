class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int key = nums[i] - i;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int n = nums.length;
        long sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if(value > 1){
                sum += ((long)value)*(value-1)/2;
            }
        }
        long total = (long) n * (n - 1) / 2;
        return total - sum;
    }
}
