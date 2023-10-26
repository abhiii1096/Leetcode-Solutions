from typing import List

class Solution:
    def numFactoredBinaryTrees(self, arr: List[int]) -> int:
        MOD = 10**9 + 7
        arr.sort()
        unique_numbers = set(arr)
        
        dp = {x: 1 for x in arr}
        
        for i in arr:
            for j in arr:
                if j > i**0.5:
                    break
                
                if i % j == 0 and i // j in unique_numbers:
                    if i // j == j:
                        dp[i] += dp[j] * dp[j]
                    else:
                        dp[i] += dp[j] * dp[i // j] * 2
                    dp[i] %= MOD
        
        result = sum(dp.values()) % MOD
        return result
