class Solution {
    public String[] divideString(String s, int k, char fill) {
        int length = s.length();
        int count = (int) Math.ceil((double) length / k);
        String[] strings = new String[count];

        for (int i = 0, j = 0; i < length; i += k, j++) {
            String part = s.substring(i, Math.min(i + k, length));
            if (part.length() < k) {
                int fillCount = k - part.length();
                StringBuilder padded = new StringBuilder(part);
                for (int f = 0; f < fillCount; f++) {
                    padded.append(fill);
                }
                strings[j] = padded.toString();
            } else {
                strings[j] = part;
            }
        }
        return strings;
    }
}
