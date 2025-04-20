class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(char x:s.toCharArray())c^=x;
        for(char y:t.toCharArray())c^=y;
        return c;
    }
}
