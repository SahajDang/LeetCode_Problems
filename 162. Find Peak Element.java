class Solution {
    public int findPeakElement(int[] nums) {
        // int left = 0, right = nums.length - 1;

        // while(left < right){
        //     int mid = left + (right - left) / 2;
        //     if(nums[mid] > nums[mid + 1]){
        //         right = mid;
        //     } else {
        //         left = mid + 1;
        //     }
        // }
        // return left;
        int n = nums.length;
        if(nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        int peak = 0;
        for(int i = 1 ; i < nums.length - 1; i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                peak = i;
            }
        }
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        return peak;
    }
}
