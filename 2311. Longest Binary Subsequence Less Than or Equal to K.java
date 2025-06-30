class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int count = 0;  
        int zeros = 0;  
        long val = 0;  
        long power = 1; 

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '0') {
                count++; 
            } else {
                if (val + power <= k) {
                    val += power;
                    count++;
                }
            }
            if (power <= k) {
                power *= 2;
            }
        }
        return count;
    }
}
