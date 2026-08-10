class Solution {
    public int maxTask(int[] h, int[] l) {
        int n = h.length;
        if (n == 0) return 0;
        if (n == 1) return Math.max(h[0], l[0]);

        // Base cases
        int prev2 = Math.max(h[0], l[0]);              // DP[0]
        int prev1 = Math.max(prev2 + l[1], h[1]);     // DP[1]

        for (int i = 2; i < n; i++) {
            // Option 1: Do low-effort task on day i -> prev1 + l[i]
            // Option 2: Do high-effort task on day i -> prev2 + h[i]
            int current = Math.max(prev1 + l[i], prev2 + h[i]);
            
            // Move variables forward
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}