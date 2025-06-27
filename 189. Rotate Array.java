// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;  
//         reverse(nums, 0, n - 1);         
//         reverse(nums, 0, k - 1);         
//         reverse(nums, k, n - 1);         
//     }

//     private void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        while(k > 0){
            int ele = nums[nums.length - 1];
            for(int i = nums.length - 1; i > 0; i--){
                nums[i] = nums[i - 1];
            }
            nums[0] = ele;
            k--;
        }
    }
}
