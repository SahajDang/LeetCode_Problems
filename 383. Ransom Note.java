class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char ch : ransomNote.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for(char ch : magazine.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            int required = entry.getValue();
            int available = map2.getOrDefault(key, 0);

            if (available < required) return false;
        }
        return true;
    }
}
