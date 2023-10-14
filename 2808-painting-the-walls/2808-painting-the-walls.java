class Solution {
    public int paintWalls(int[] cost, int[] time) {
        final int n = cost.length;
        final int limit = n << 1;
        final int m = limit | 1;
        int[][] dp = new int[2][m];
        
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        dp[0][n] = 0;
        int last = 0;

        for (int i = 0; i < n; ++i) {
            int now = last ^ 1;
            Arrays.fill(dp[now], -1);

            for (int j = 0; j <= limit; ++j) {
                if (dp[last][j] >= 0) {
                    int newTime = Math.min(limit, j + time[i]);
                    int newCost = dp[last][j] + cost[i];
                    better(dp[now], newTime, newCost);

                    if (j > 0) {
                        better(dp[now], j - 1, dp[last][j]);
                    }
                }
            }

            last ^= 1;
        }

        int[] r = new int[]{Integer.MAX_VALUE}; 
        for (int i = n; i <= limit; ++i) {
            better(r, 0, dp[last][i]);
        }

        return r[0] == Integer.MAX_VALUE ? -1 : r[0]; 
    }

    private void better(int[] x, int index, int value) {
        if (value >= 0 && (x[index] < 0 || x[index] > value)) {
            x[index] = value;
        }
    }
}
