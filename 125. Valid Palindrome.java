class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) return true;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            
        }
        return true;
    }
}
