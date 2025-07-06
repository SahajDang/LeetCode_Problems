class Solution {
    public int countNicePairs(int[] nums) {
        int MOD = 1_000_000_007;
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0;
        
        for (int num : nums) {
            int key = num - rev(num);
            int count = map.getOrDefault(key, 0);
            res = (res + count) % MOD;
            map.put(key, count + 1);
        }
        
        return (int) res;
    }

    static private int rev(int num){
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
