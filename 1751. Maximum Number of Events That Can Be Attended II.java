class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int n = events.length;

        int[][] dp = new int[n + 1][k + 1];

        // Build list of start times for binary search
        int[] startDays = new int[n];
        for (int i = 0; i < n; i++) {
            startDays[i] = events[i][0];
        }

        for (int i = n - 1; i >= 0; i--) {
            int nextIdx = binarySearch(events, events[i][1]);
            for (int j = 1; j <= k; j++) {
                // Either take it or skip it
                dp[i][j] = Math.max(
                    dp[i + 1][j], // skip this event
                    events[i][2] + (nextIdx == -1 ? 0 : dp[nextIdx][j - 1])
                );
            }
        }
        return dp[0][k];
    }

    private int binarySearch(int[][] events, int targetEnd) {
        int low = 0, high = events.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (events[mid][0] > targetEnd) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low < events.length ? low : -1;
    }
}
