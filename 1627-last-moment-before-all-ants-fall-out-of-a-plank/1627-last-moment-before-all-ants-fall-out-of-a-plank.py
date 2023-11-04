class Solution:
    def getLastMoment(self, n: int, left: List[int], right: List[int]) -> int:
        # For ants moving to the left, the time taken to fall off is the same as their initial position.
        # For ants moving to the right, the time taken to fall off is (n - their initial position).
        
        # If there are ants moving to the left, find the maximum time taken by them to fall off
        max_left_time = max(left) if left else 0
        
        # If there are ants moving to the right, find the maximum time taken by them to fall off
        max_right_time = max(n - x for x in right) if right else 0
        
        # Return the maximum of max_left_time and max_right_time
        return max(max_left_time, max_right_time)