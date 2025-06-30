class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> list = new HashSet<>();
        
        for(int i = 0; i < nums.length - 1; i++){
            if((nums[i + 1] - nums[i]) == 1){
                list.add(nums[i]);
            }
        }

        int maxLength = 0;
        for (Integer val : list) {
            int freq1 = map.get(val);
            int freq2 = map.get(val + 1);
            int length = freq1 + freq2;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
