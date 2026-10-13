class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Using HashSet 
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     if(set.contains(num)){
        //         return !false;
        //     }
        //     set.add(num);
        // }
        // return !true;

        //Using HasMap
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     if(map.containsKey(num)){
        //         return true;
        //     }
        //     map.put(num,1);
        // }
        // return false;

        //Using the brute force

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //Using the two pointers approach

        Arrays.sort(nums);
        int i=0;int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}