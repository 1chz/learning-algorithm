# O(n) / O(1) solution

# Runtime: 56 ms, faster than 91.34% of Python3
# Memory Usage: 15.1 MB, less than 67.47% of Python3
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        for i in range(len(prices) - 1):
            if prices[i] < prices[i + 1]:
                profit += prices[i + 1] - prices[i]
        return profit
