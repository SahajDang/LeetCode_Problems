class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        boolean[] used = new boolean[n]; 
        boolean[] haveBox = new boolean[n];
        boolean[] haveKey = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        for (int box : initialBoxes) {
            haveBox[box] = true;
        }

        for (int box : initialBoxes) {
            if (status[box] == 1) {
                queue.offer(box);
                used[box] = true;
            }
        }

        int totalCandies = 0;

        while (!queue.isEmpty()) {
            int box = queue.poll();
            totalCandies += candies[box];

            for (int key : keys[box]) {
                if (!haveKey[key]) {
                    haveKey[key] = true;
                    if (haveBox[key] && !used[key]) {
                        queue.offer(key);
                        used[key] = true;
                    }
                }
            }

            for (int newBox : containedBoxes[box]) {
                haveBox[newBox] = true;
                if (status[newBox] == 1 || haveKey[newBox]) {
                    if (!used[newBox]) {
                        queue.offer(newBox);
                        used[newBox] = true;
                    }
                }
            }
        }
        return totalCandies;
    }
}
