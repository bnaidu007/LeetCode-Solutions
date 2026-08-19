class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(arr);
        // return arr;
        int left = 0;int right= nums.length-1;int k=nums.length-1;
        while(left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if(leftsq>rightsq){
                arr[k]=leftsq;
                left++;
            }
            else{
                arr[k] = rightsq;
                right--;
            }
            k--;
        }
        return arr;
    }
}