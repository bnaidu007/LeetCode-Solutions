import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Step 1: create result array
        int[] res = new int[m + n];

        // Step 2: copy nums1 elements
        for (int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }

        // Step 3: copy nums2 elements
        for (int i = 0; i < n; i++) {
            res[m + i] = nums2[i];
        }

        // Step 4: sort result
        Arrays.sort(res);

        // Step 5: copy back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = res[i];
        }
    }
}