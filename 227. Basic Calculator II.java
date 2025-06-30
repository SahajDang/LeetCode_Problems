class Solution {
    public int calculate(String s) {
        // Maintain a stack(It Stores number)
        Stack<Integer> stack = new Stack<>();
        int operand = 0;
        char operator = '+'; // + as the default opeartion
        // Scan the Expression from left to right
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i); // Pick the Character
            if(Character.isDigit(ch)){
                operand = operand * 10 + (ch - '0');
            }
            if(!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1){
                switch(operator){
                    case '+':
                    stack.push(operand);
                    break; 

                    case '-':
                    stack.push(-operand);
                    break;

                    case '*':
                    stack.push(stack.pop() * operand);
                    break;

                    case '/':
                    stack.push(stack.pop() / operand);
                    break;
                }
            operator = ch;
            operand = 0; 
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
