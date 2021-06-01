'''
Climbing Stairs

06/01/2021
https://leetcode.com/problems/climbing-stairs/
'''

class Solution:
    # def climbStairs(self, n: int) -> int:
    #     if n <= 2:
    #         return n
    #     a, b =1, 2
    #     for _ in range(3, n+1):
    #         tmp = a + b
    #         a = b
    #         b = tmp
    #     return b
    
    def climbStairs(self, n: int) -> int:
        if n == 1:
        	return n
        stp = [0, 1, 2] + [-1] * (n-2)
        return self.recur(n, stp)
        
    def recur(self, n, stp):
        if stp[n] == -1:
            stp[n]=self.recur(n-1, stp)+self.recur(n-2, stp)
            
        return stp[n]