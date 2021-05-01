# Stack solution
# 어렵다.....
# O(n) solution
# Runtime: 528 ms, faster than 42.51% of Python3
# Memory Usage: 19.9 MB, less than 5.68% of Python3
from collections import deque


class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        stack, result = list(), [0] * len(T)

        for i, temp in enumerate(T):
            while stack and stack[-1][1] < temp:
                pop = stack.pop()
                result[pop[0]] = i - pop[0]

            stack.append([i, temp])

        return result
