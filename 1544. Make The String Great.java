class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char SingleChar : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs((stack.peek() - SingleChar)) == 32){
                stack.pop();
            }else{
                stack.push(SingleChar);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char SingleChar : stack){
            sb.append(SingleChar);
        }
        return sb.toString();
    }
}
