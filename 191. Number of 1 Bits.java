class Solution {
    public int hammingWeight(int n) {
        // return Integer.bitCount(n);
        // TC - O(number of 1 Bits) SC- O(1)
        int count = 0;
        while(n > 0){
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
