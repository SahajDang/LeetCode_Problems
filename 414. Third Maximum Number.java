class Solution {
    int[] removeDuplicates(int arr[]){
        int n = arr.length;
        int idx = 1; 
      
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, idx);
    }
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        nums = removeDuplicates(nums);
        int n = nums.length;
        if(nums.length >= 3) return nums[n - 3];
        else return nums[n - 1];
    }
}
