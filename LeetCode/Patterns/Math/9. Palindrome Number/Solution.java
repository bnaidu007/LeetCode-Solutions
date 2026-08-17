class Solution {
    public boolean isPalindrome(int x) {
        //two pointer method
        // String st = String.valueOf(x);
        // int left = 0;
        // int right = st.length()-1;
        // while(left<right){
        //     if(st.charAt(left)!=(st.charAt(right))){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;


        //Using the number reverse
        int or =x;
        int re = 0;
        while(x>0){
        
        int digit = x%10;
        re = re *10 +digit;
        x=x/10;
    }
    return or==re;
    }
}