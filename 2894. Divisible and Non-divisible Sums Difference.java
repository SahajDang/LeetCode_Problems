class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible_sum = 0;
        int non_div_sum = 0;
        for(int i = 1 ; i <= n; i++){
            if(i % m == 0){
                divisible_sum += i;
            }else{
                non_div_sum += i;
            }
        }
        return non_div_sum - divisible_sum ;
    }
}
