class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int min = nums[0];
        int p = 1;

        for(int i=1;i<n;i++){
            if(nums[i]-min>k){
                p+=1;
                min = nums[i];
            }
        }

        return p;
    }
}
