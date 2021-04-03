# O(n) solution (분류하고자 하는 가짓수가 미리 정해져있어서 가능)
# Runtime: 32 ms, faster than 74.52% of Python3
# Memory Usage: 14.1 MB, less than 90.79% of Python3

from collections import Counter
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        c = Counter(nums)
        nums[:] = [0] * c[0] + [1] * c[1] + [2] * c[2]