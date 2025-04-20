import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int num : arr) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }
        Set<Integer> occurrences = new HashSet<>(numbers.values());

        return occurrences.size() == numbers.size();
    }
}
