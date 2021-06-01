'''
Word Break

06/01/2021
https://leetcode.com/problems/word-break/
'''
class Solution:
	def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        n = len(s)
        dp = [False for i in range(n+1)]
        dp[0] = True
        
        for i in range(1,n+1): # 각 문자열의 문자에서
            for w in wordDict: # wordDict의 모든 문자열을 검사해줌
                if dp[i-len(w)] and s[i-len(w):i]==w: #문자열의 시작이 True이고 해당 문자열이 포함되면
                    dp[i]=True
        return dp[-1]