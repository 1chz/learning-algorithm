# 1) Greedy approach : ERROR ! we always should know its next index
# 2) DP the optimal robbery at each index
# best_rob = [2, 7, max(7, 2+9), ..., max(best_rob[n-1], best_rob[n-2] + nums[n])]

# time complexity: O(n), space complexity: O(1)
# Runtime: 28 ms, faster than 86.98% of Python3
# Memory Usage: 14.1 MB, less than 93.38% of Python3
class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) <= 2:
            return max(nums)

        best, prev, current = max(nums[0], nums[1]), nums[0], max(nums[0], nums[1])

        for i in range(2, len(nums)):
            # fill best_rob
            next_val = max(current, prev + nums[i])
            if best < next_val:
                best = next_val
            prev, current = current, next_val

        return best
