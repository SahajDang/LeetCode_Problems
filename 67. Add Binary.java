class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            res = (sum % 2) + res;
            carry = sum / 2;

            i--;
            j--;
        }

        return res;
    }
}
