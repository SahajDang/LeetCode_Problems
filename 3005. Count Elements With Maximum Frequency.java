class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxValue = Integer.MIN_VALUE;
        for (int value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        int count = 0;
        for (int value : map.values()) {
            if (value == maxValue) {
                count += value;
            }
        }
        return count;
    }
}
