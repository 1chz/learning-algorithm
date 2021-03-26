# O(n) solution with two pointers
# Runtime: 180 ms, faster than 98.94% of Python3
# Memory Usage: 18.6 MB, less than 41.28% of Python3

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        start, end = 0, len(s) - 1
        while start < end:
            s[start], s[end] = s[end], s[start]
            start += 1
            end -= 1
