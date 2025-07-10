class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '*') {
                sb.deleteCharAt(i); // remove '*'
                if (i > 0) {
                    sb.deleteCharAt(i - 1); // remove character before '*'
                    i -= 2; // move back since we deleted 2 characters
                } 
            }
        }
        return sb.toString();
    }
}
