class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                evenFreqs.add(freq);
            } else {
                oddFreqs.add(freq);
            }
        }

        int maxDiff = Integer.MIN_VALUE;

        for (int odd : oddFreqs) {
            for (int even : evenFreqs) {
                maxDiff = Math.max(maxDiff, odd - even);
            }
        }

        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }
}
