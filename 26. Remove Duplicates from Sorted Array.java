import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int index = 0;

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, true);
                nums[index++] = num;
            }
        }

        return index;
    }
}
