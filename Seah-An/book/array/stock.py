from typing import List
import sys


class Solution(object):
    def maxProfit(self, prices: List[int]) -> int:
        revenue = 0
        # typeError 방지하기 위해 최솟값은 시스템의 최댓값, 최댓값은 시스템의 최솟값으로 설정하는 것이 좋음.
        # 시스템의 최솟값은 -sys.maxsize
        bottom = sys.maxsize

        for price in prices:
            bottom = min(bottom, price)
            revenue = max(revenue, price - bottom)

        return revenue


if __name__ == "__main__":
    rs = Solution()
    nums: List[str] = [7, 1, 5, 3, 6, 4]
    print(rs.maxProfit(nums))
