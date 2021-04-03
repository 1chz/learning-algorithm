# Runtime: 60 ms, faster than 91.95% of Python3
# Memory Usage: 15 MB, less than 60.75% of Python3
# O(n)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sum_array = []
        current_sum, negative = 0, True
        for v in nums:
            if current_sum + v < 0:
                current_sum = 0
            else:
                current_sum += v
                negative = False

            sum_array.append(current_sum)

        if negative is True:
            return max(nums)

        return max(sum_array)
