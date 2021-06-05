'''
Palindrome Number

06/04/2021

https://leetcode.com/problems/palindrome_number
'''

class Solution:
	def isPalindrome(self, x: int) -> bool:
        # num = str(x)
        # i, j = 0, len(num) - 1
        # while i <= j:
        #     if num[i] != num[j]:
        #         return False
        #     i += 1
        #     j -= 1
        # return True


        if x < 0 or (x % 10 == 0 and x !=0):
            return False
        reverse = 0
        while x > reverse:
            reverse = reverse* 10 + x % 10
            x //= 10
        return True if x == reverse or x == reverse // 10 else False