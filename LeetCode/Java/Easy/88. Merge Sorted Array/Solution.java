class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // int[] arr = new int[m + n];

        // int k = 0;

        // for (int i = 0; i < m; i++) {
        //     arr[k] = nums1[i];
        //     k++;
        // }

        // for (int i = 0; i < n; i++) {
        //     arr[k] = nums2[i];
        //     k++;
        // }

        // Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {
        //     nums1[i] = arr[i];
        // }
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0&&nums1[i]>nums2[j]){
                nums1[k] =nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
    }
}