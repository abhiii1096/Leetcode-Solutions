from bisect import bisect_right, bisect_left

class Solution:
    def fullBloomFlowers(self, flowers, people):
        start = sorted([s for s, e in flowers])
        end = sorted([e for s, e in flowers])
        return [bisect_right(start, t) - bisect_left(end, t) for t in people]
