# two pointer solution O(n^2)
# Middle can be any index from 0 to (n-1) in the loop.
# Two pointers depart from middle point and expand to left and right.

class Solution:
    def expand(self, left: int, right: int, s: str) -> str:
        result = ""
        while 0 <= left and right <= len(s) - 1:
            if s[left] != s[right]:
                return result

            result = s[left: right + 1]
            left -= 1
            right += 1
        return result

    def longestPalindrome(self, s: str) -> str:
        if len(s) == 1 or s == s[::-1]:
            return s

        result = ""
        for i, char in enumerate(s):
            result = max(result, self.expand(i, i, s), self.expand(i, i + 1, s), key=lambda x: len(x))

        return result
