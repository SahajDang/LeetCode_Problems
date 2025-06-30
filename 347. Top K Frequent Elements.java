class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); 
        List<Integer> lists = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : list) {
            lists.add(entry.getKey());
        }

        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = list.get(i).getKey();
        }
        return array;
    }
}
