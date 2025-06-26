class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] sarr = new int[m + n];
        for(int i = 0; i < m; i++){
            sarr[i] = nums1[i];
        }
        for(int j = 0; j < n; j++){
            sarr[m] = nums2[j];
            m++;
        }
        Arrays.sort(sarr);
        // double mid = 0;
        // int x = sarr.length;
        // if(x % 2 == 0){
        //     double left = sarr[(x / 2) - 1];
        //     double right = (double) sarr[(int) Math.floor((x + 1) / 2)];
        //     mid = (left + right) / 2;
        //     return mid;
        // }else{
        //     mid = sarr[(x) / 2];
        //     return mid;
        // }
        double median = sarr.length;
        double mid = 0.0;
        if(median % 2 == 0){
            mid = (double) (sarr[sarr.length / 2] + sarr[(sarr.length / 2) - 1]) / 2;
        }else{
            mid = sarr[(int) Math.ceil((sarr.length / 2))];
        }
        return mid;
    }
}
