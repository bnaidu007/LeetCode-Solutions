import java.util.*;

class Solution {

    public List<Integer> largestSquare(int[][] mat, int[][] queries, int k) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] prefix = new int[n + 1][m + 1];

        // Build Prefix Sum Matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                prefix[i][j] = mat[i - 1][j - 1]
                             + prefix[i - 1][j]
                             + prefix[i][j - 1]
                             - prefix[i - 1][j - 1];
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {

            int r = q[0];
            int c = q[1];

            int maxRadius = Math.min(
                    Math.min(r, n - 1 - r),
                    Math.min(c, m - 1 - c)
            );

            int low = 0;
            int high = maxRadius;

            int best = -1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                int r1 = r - mid;
                int c1 = c - mid;
                int r2 = r + mid;
                int c2 = c + mid;

                int ones = prefix[r2 + 1][c2 + 1]
                         - prefix[r1][c2 + 1]
                         - prefix[r2 + 1][c1]
                         + prefix[r1][c1];

                if (ones <= k) {

                    best = 2 * mid + 1;
                    low = mid + 1;

                } else {

                    high = mid - 1;
                }
            }

            ans.add(best);
        }

        return ans;
    }
}