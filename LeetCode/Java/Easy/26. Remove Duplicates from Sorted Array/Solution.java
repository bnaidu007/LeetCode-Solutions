class Solution {
    public int removeDuplicates(int[] nums) {

        // If array is empty, no unique elements
        if (nums.length == 0) {
            return 0;
        }

        // i keeps track of last unique element index
        int i = 0;

        // j scans the array
        for (int j = 1; j < nums.length; j++) {

            // If a new unique element is found
            if (nums[j] != nums[i]) {
                i++;                 // move to next position
                nums[i] = nums[j];   // place unique element
            }
        }

        // Number of unique elements
        return i + 1;
    }
}