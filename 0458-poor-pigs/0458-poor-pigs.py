class Solution:
    def poorPigs(self, buckets: int, minutesToDie: int, minutesToTest: int) -> int:
       
        T = (minutesToTest // minutesToDie) + 1
        pigs = 0
       
        prod = 1
        
        while prod < buckets:
            prod *= T
            pigs += 1
        
        return pigs