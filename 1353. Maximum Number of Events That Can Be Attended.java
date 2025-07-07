class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        int n = events.length;
        int i = 0;
        int count = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Find the earliest start day and the latest end day
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int[] e : events) {
            minDay = Math.min(minDay, e[0]);
            maxDay = Math.max(maxDay, e[1]);
        }
        // For each day
        for (int day = minDay; day <= maxDay; day++) {
            // Add all events starting today
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]); // Add end day
                i++;
            }
            // Remove all events already expired
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }
            // Attend event ending soonest
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
            }
        }
        return count;
    }
}
