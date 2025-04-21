class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score = 0l;
        int index = 0;
        int n = instructions.length;
        Set<Integer> visited = new HashSet<>();
        while(index >= 0 && index < n && !visited.contains(index)){
            visited.add(index);
            if(instructions[index].equals("add")){
                score += values[index];
                index++;
            }else{
                index = index + values[index];
            }
        }
        return score;
    }
}
