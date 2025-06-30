class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int starting = 0;
        int surplus = 0;
        int deficit = 0;

        for(int i = 0; i < gas.length; i++){
            int diff = gas[i] - cost[i];
            surplus += diff;
            deficit += diff;
            if(surplus < 0){
                starting = i + 1;
                surplus = 0;
            }
        }
        if(deficit >= 0) return starting;
        
        return -1;
    }
}
