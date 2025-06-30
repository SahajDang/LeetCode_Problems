class Solution {
    public int minMaxDifference(int num) {
        int num1 = num;
        String str = Integer.toString(num1);

        char targetMax = ' ';
        for (char ch : str.toCharArray()) {
            if (ch != '9') {
                targetMax = ch;
                break;
            }
        }
        String maxStr = (targetMax == ' ') ? str : str.replace(targetMax, '9');

        char targetMin = str.charAt(0);
        String minStr = str.replace(targetMin, '0');
        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}
