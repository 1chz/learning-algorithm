# O(n) solution
# Greedy & Divide and conquer

# Runtime: 52 ms, faster than 19.12% of Python3
# Memory Usage: 14.5 MB, less than 6.24% of Python3

class Solution:
    def removeDuplicateLetters(self, s):
        for char in sorted(set(s)):
            i = s.index(char)
            if not (set(s[:i]) - set(s[i:])):
                return char + self.removeDuplicateLetters(s[i + 1:].replace(char, ""))

        return ''
