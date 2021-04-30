# Reverse Integer

# https://leetcode.com/problems/reverse-integer/
# 04/30/21

class Solution:
    def reverse(self, x: int) -> int:
        tmp = str(x)
        if tmp[0] == '-':
            tmp ='-' + tmp[1:][::-1]
        else:
            tmp = tmp[::-1]
            
        if int(tmp) <-2**31 or int(tmp) > 2**31 - 1:
            return 0
        
        return int(tmp)