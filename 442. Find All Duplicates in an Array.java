class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
    
            if(value > 1){
                output.add(key);
            } 
        }
        return output;
    }
}
