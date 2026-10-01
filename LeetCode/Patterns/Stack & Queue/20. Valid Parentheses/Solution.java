class Solution {
    public boolean isValid(String s) {

        // Step 1: Create stack
        Stack<Character> st = new Stack<>();

        // Step 2: Traverse string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Step 3: If opening bracket → push into stack
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } 
            else {
                // Step 4: If closing bracket

                // If stack empty → no opening → invalid
                if (st.isEmpty()) {
                    return false;
                }

                // Take last opening bracket
                char top = st.pop();

                // Step 5: Check matching
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        // Step 6: Final check → stack should be empty
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}