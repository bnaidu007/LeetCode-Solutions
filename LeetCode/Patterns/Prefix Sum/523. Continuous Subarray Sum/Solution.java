class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return fase;
        }
       int prefix[] = new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
        prefix[i+1]=prefix[i]+nums[i];
       } 
       for(int left=0;left<nums.length;left++){
        for(int right=left;right<nums.length;right++){
            int sum =prefix[right+1]-prefix[left];

            if(sum%k==0){
                return true;
            }
        }
       }
       return false;
    }
}