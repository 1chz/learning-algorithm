class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) < 1:
            return "";
        start, end = 0, 0
        for i in range(len(s)):
            len1 = self.expandAroundCenter(s, i, i)
            len2 = self.expandAroundCenter(s, i, i+1)
            maxLen = max(len1, len2)
            if maxLen > end - start: # there is a palindrome substring
                start = i - (maxLen - 1) // 2
                end = i + maxLen // 2
        
        return s[start: end+1]
    
    def expandAroundCenter(self, s: str, left: int, right: int) -> int:
        while left >=0 and right < len(s) and s[left] == s[right]:
            left -=1
            right += 1
        return right - left - 1