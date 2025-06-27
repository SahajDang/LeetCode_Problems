class Solution {
    Map<Character, List<Character>> adj;

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        adj = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            adj.putIfAbsent(a, new ArrayList<>());
            adj.putIfAbsent(b, new ArrayList<>());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : baseStr.toCharArray()) {
            Set<Character> visited = new HashSet<>();
            char smallestChar = dfs(ch, visited);
            result.append(smallestChar);
        }

        return result.toString();
    }

    private char dfs(char ch, Set<Character> visited) {
        visited.add(ch);
        char minChar = ch;
        List<Character> neighbors = adj.getOrDefault(ch, new ArrayList<>());

        for (char nei : neighbors) {
            if (!visited.contains(nei)) {
                char candidate = dfs(nei, visited);
                if (candidate < minChar) {
                    minChar = candidate;
                }
            }
        }
        return minChar;
    }
}
