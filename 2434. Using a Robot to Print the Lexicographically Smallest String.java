class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        Stack<Character> t = new Stack<>();
        char minChar = 'a';

        for (char c : s.toCharArray()) {
            t.push(c);
            freq[c - 'a']--;

            // update minChar to next available smallest character
            while (minChar <= 'z' && freq[minChar - 'a'] == 0) {
                minChar++;
            }

            while (!t.isEmpty() && t.peek() <= minChar) {
                result.append(t.pop());
            }
        }

        while (!t.isEmpty()) {
            result.append(t.pop());
        }

        return result.toString();
    }
}
