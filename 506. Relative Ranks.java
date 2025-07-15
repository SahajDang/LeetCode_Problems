class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] sp = new int[score.length];

        // Clone original array
        for (int i = 0; i < sp.length; i++) {
            sp[i] = score[i];
        }

        // Sort in descending order
        Arrays.sort(sp);
        for (int i = 0; i < sp.length / 2; i++) {
            int temp = sp[i];
            sp[i] = sp[sp.length - 1 - i];
            sp[sp.length - 1 - i] = temp;
        }

        // Map each score to its rank (1-based index)
        for (int i = 0; i < sp.length; i++) {
            map.put(sp[i], i + 1);
        }

        // Prepare result using original score order
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = map.get(score[i]);
            if (rank == 1) {
                result[i] = "Gold Medal";
            } else if (rank == 2) {
                result[i] = "Silver Medal";
            } else if (rank == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(rank);
            }
        }

        return result;
    }
}



// class Solution {
//     public String[] findRelativeRanks(int[] score) {
//         int n = score.length;
//         String[] result = new String[n];
//         int[] sorted = score.clone();
//         Arrays.sort(sorted);
//         for (int i = 0; i < n / 2; i++) {
//             int temp = sorted[i];
//             sorted[i] = sorted[n - 1 - i];
//             sorted[n - 1 - i] = temp;
//         }

//         Map<Integer, String> rankMap = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             if (i == 0)
//                 rankMap.put(sorted[i], "Gold Medal");
//             else if (i == 1)
//                 rankMap.put(sorted[i], "Silver Medal");
//             else if (i == 2)
//                 rankMap.put(sorted[i], "Bronze Medal");
//             else
//                 rankMap.put(sorted[i], String.valueOf(i + 1));
//         }

//         for (int i = 0; i < n; i++) {
//             result[i] = rankMap.get(score[i]);
//         }

//         return result;
//     }
// }
