class Solution {
    public int maxDistance(String s, int k) {
        int n = s.length();
        int N = 0, S = 0, W = 0, E = 0;
        int ans = 0, d1 = 0, d2 = 0, cur = 0;
        char ch;

        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);

            switch (ch) {
                case 'N' -> N++;
                case 'S' -> S++;
                case 'W' -> W++;
                default -> E++;
            }

            d1 = Math.min(N, S);
            d2 = Math.min(E, W);

            cur = Math.abs(N - S) + Math.abs(E - W) + 2 * Math.min(d1 + d2, k);
            ans = Math.max(ans, cur);
        }

        return ans;
    }
}
