# O(n), O(n)
# Runtime: 156 ms, faster than 94.81% of Python3
# Memory Usage: 15.4 MB, less than 82.28% of Python3
from collections import Counter


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        c, major_size, result = Counter(nums), len(nums) / 2, 0
        for k, v in c.items():
            if major_size <= v:
                return k
