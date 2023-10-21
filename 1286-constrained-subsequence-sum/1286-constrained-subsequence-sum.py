
class Solution:
    def constrainedSubsetSum(self, nums: List[int], k: int) -> int:
        
        dp = [0] * len(nums)
        
        q = deque()
        max_sum = float('-inf')

        for i in range(len(nums)):
            
            dp[i] = nums[i] + (0 if not q else dp[q[0]])

            
            max_sum = max(max_sum, dp[i])

            
            while q and q[0] < i - k + 1:
                q.popleft()

            
            while q and dp[i] > dp[q[-1]]:
                q.pop()

            
            if dp[i] > 0:
                q.append(i)

        return max_sum