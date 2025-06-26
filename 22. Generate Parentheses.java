class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
         helper(0, 0, 0, "", result, n);
         return result;
    }
    public void helper(int opening, int closing, int index, String output, List<String> result, int n){
        if(index == n * 2) {
            result.add(output);
            return;
        }
        if(opening < n) {
            helper(opening + 1, closing, index + 1, output + "(", result, n);
        }

        if(closing < opening){
            helper(opening, closing + 1, index + 1, output + ")", result, n);
        }
    }
}
