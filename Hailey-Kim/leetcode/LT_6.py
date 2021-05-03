'''
ZigZag Conversion

04/30/21


https://leetcode.com/problems/zigzag-conversion/
'''


class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        
        store = [[] for _ in range(numRows)]
        answer = ''

        i = 0
        toggleDown = True

        for x in s:
            store[i].append(x)
            if i == 0:
                toggleDown = True
            elif i == numRows - 1:
                toggleDown = False
            if toggleDown:
                i += 1
            else:
                i -= 1

        for i in range(numRows):
            answer += ''.join(store[i])

        return answer