class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Using Basic ethod
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             set.add(nums1[i]);
        //             break;
        //         }
        //     }
        // }
        // int res[] = new int[set.size()];
        // int k=0;
        // for(int num : set){
        //     res[k++]=num;
        // }
        // return res;

        //Using HashMap
        // HashMap<Integer,Integer> map = new HashMap<>();
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums1){
        //     map.put(num,1);
        // }
        // for(int num :nums2){
        //     if(map.containsKey(num)){
        //         set.add(num);
        //     }
        // }
        // int ans[] = new int[set.size()];
        // int k = 0;
        // for(int num : set){
        //     ans[k++]= num;
        // }
        // return ans;

        //Using HashSet

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num :nums2){
            if(set.contains(num)){
                set1.add(num);
            }
        }
        int ans[] = new int[set1.size()];
        int k=0;
        for(int num : set1){
            ans[k++] = num;
        }
        return ans;
    }
}