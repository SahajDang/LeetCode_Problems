class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        if((hasConsonant(word) && hasVowel(word) && doesNotContainSpecialChar(word)) || (hasConsonant(word) && hasVowel(word) && doesNotContainSpecialChar(word) && hasDigit(word))){
            return true;
        }else{
            return false;
        }
    }
    static boolean hasConsonant(String word){
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < word.length(); i++) {
            if (consonants.indexOf(word.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
    static boolean hasVowel(String word){
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
    static boolean hasDigit(String word){
        String digits = "0123456789";
        for (int i = 0; i < word.length(); i++) {
            if (digits.indexOf(word.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
    static boolean doesNotContainSpecialChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
