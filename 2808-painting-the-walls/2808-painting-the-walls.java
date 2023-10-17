class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int limit = 2 * n;
        int m = limit + 1;
        int[][] dp = new int[2][m];

        for (int i = 0; i < 2; i++) {
            Arrays.fill(dp[i], -1);
        }

        dp[0][n] = 0;
        int last = 0;

        for (int i = 0; i < n; i++) {
            int now = 1 - last;
            Arrays.fill(dp[now], -1);

            for (int j = 0; j <= limit; j++) {
                if (dp[last][j] >= 0) {
                    int newTime = Math.min(limit, j + time[i]);
                    int newCost = dp[last][j] + cost[i];
                    update(dp[now], newTime, newCost);

                    if (j > 0) {
                        update(dp[now], j - 1, dp[last][j]);
                    }
                }
            }

            last = now;
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = n; i <= limit; i++) {
            if (dp[last][i] >= 0) {
                minCost = Math.min(minCost, dp[last][i]);
            }
        }

        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }

    private void update(int[] x, int index, int value) {
        if (value >= 0 && (x[index] < 0 || x[index] > value)) {
            x[index] = value;
        }
    }
}
