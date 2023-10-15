class Solution {
    public int numWays(int steps, int arrLen) {
        if (arrLen == 1) {
            return 1;
        }
        
        arrLen = Math.min(steps / 2 + 1, arrLen);
        long modulo = 1_000_000_007;

        long[] dp = new long[arrLen];
        dp[0] = 1;
        dp[1] = 1;
        long[] dp2 = new long[arrLen];

        for (int i = 2; i <= steps; i++) {
            int maxPos = Math.min(i + 1, arrLen);
            dp2[0] = (dp[0] + dp[1]) % modulo;
            for (int j = 1; j < maxPos - 1; j++) {
                dp2[j] = (dp[j - 1] + dp[j] + dp[j + 1]) % modulo;
            }
            dp2[maxPos - 1] = (dp[maxPos - 2] + dp[maxPos - 1]) % modulo;

            long[] temp = dp;
            dp = dp2;
            dp2 = temp;
        }

        return (int)dp[0];
    }
}