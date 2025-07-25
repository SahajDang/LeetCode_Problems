class FindSumPairs {
    int[] nums1;
    int[] nums2;
    Map<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();
        for(int num : nums2){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int value = nums2[index];
        int updatedVal = value + val;

        map.put(value, map.get(value) - 1);
        if (map.get(value) == 0) {
            map.remove(value);
        }
        map.put(updatedVal, map.getOrDefault(updatedVal, 0) + 1);
        nums2[index] = updatedVal;
    }
    
    public int count(int tot) {
        int c = 0;
        // nums1[i] == total - nums2[j]
        for(int num1 : nums1){
            int neededVal = tot - num1;
            c = c + map.getOrDefault(neededVal, 0);
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
