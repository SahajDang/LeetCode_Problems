class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1) return 1;

        s = s.trim();
        String[] words = s.split(" ");
        String lastWord = "";
        if (words.length > 0) {
            lastWord = words[words.length - 1];
        } 
        return lastWord.length();
    }
}
