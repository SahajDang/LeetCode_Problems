class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);

        char targetMax = ' ';
        for (char ch : str.toCharArray()) {
            if (ch != '9') {
                targetMax = ch;
                break;
            }
        }
        String maxStr = (targetMax == ' ') ? str : str.replace(targetMax, '9');

        char targetMin = ' ';
        char replacement = ' ';
        if (str.charAt(0) != '1') {
            targetMin = str.charAt(0);
            replacement = '1';
        } else {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    targetMin = str.charAt(i);
                    replacement = '0';
                    break;
                }
            }
        }
        String minStr = (targetMin == ' ') ? str : str.replace(targetMin, replacement);

        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}
