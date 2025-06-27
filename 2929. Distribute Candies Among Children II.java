class Solution {
    public static long helper(long candies) {
        if (candies < 0) {
            return 0;
        }
        return (candies + 2) * (candies + 1) / 2;
    }

    public long distributeCandies(long n, long limit) {
        long total = helper(n);

        long OneExceeds = 3 * helper(n - (limit + 1));

        long TwoExceed = 3 * helper(n - 2 * (limit + 1));

        long ThreeExceed = 1 * helper(n - 3 * (limit + 1));
        long result = total - OneExceeds + TwoExceed - ThreeExceed;

        return result;
    }
}
