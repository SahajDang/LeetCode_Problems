class Solution {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : s.toCharArray()) {
            if (top > 0 && stack[top - 1] == c) {
                top--;
            } else {
                stack[top++] = c;
            }
        }

        return new String(stack, 0, top);
    }
}
