class Solution {
    public boolean isPalindrome(String s) {
        String st = s.trim().toLowerCase().replaceAll("[^a-z0-9]","");
        int  left = 0;
        int right =st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}