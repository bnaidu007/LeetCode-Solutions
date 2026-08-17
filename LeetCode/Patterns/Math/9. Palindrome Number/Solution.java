class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0){
            return false;
        }
        String st = String.valueOf(x);

        int left = 0;
        int right = st.length()-1;

        while(left<right){
            if (st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;

    }
}