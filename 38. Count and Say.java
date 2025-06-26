import java.util.*;

public class Solution {

    // Helper 1: Convert string to pairs [digit, consecutive frequency]
    public List<int[]> digitFrequencies(String number) {
        List<int[]> result = new ArrayList<>();
        int count = 1;
        char prev = number.charAt(0);

        for (int i = 1; i < number.length(); i++) {
            char curr = number.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                // Add [digit, frequency]
                result.add(new int[]{prev - '0', count});
                prev = curr;
                count = 1;
            }
        }
        // Add last group
        result.add(new int[]{prev - '0', count});

        return result;
    }

    // Helper 2: Build new string from pairs by concatenating "frequency" + "digit"
    public String buildIntegerFromPairs(List<int[]> pairs) {
        StringBuilder sb = new StringBuilder();

        for (int[] pair : pairs) {
            sb.append(pair[1]).append(pair[0]);
        }

        return sb.toString();
    }
    public String countAndSay(int n) {
        String current = "1";

        for (int i = 1; i < n; i++) {
            List<int[]> pairs = digitFrequencies(current);
            current = buildIntegerFromPairs(pairs);
        }

        return current;
    }
}
