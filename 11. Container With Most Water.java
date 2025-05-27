class Solution {
    public int maxArea(int[] height) {
        //Appraoch 1 -TLE

        //area
        //width
        //min height
        // 2 indices i, j width = j - i
        // minheight = min(height[i], height[j])
        //area = minHeight * width
        // int max = 0;
        // for(int i = 0; i < height.length; i++){
        //     for(int j = i + 1; j < height.length; j++){
        //         int minHeight = Math.min(height[i], height[j]);
        //         int width = j - i;
        //         int area = h * w;
        //         max = Math.max(area, max);
        //     }
        // }
        // return max;



        //Approach 2 - Two pointer approach

        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            max = Math.max(area, max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
