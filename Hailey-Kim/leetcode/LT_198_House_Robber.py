"""
House Robber

06/09/2021
leetcode.com/problems/house-robber/

"""
class Solution:
    def rob(self,  nums: List[int]) -> int:
        n = len(nums)
        if n <=2: return max(nums)

        dp = [nums[0], nums[1]] + [0] * (n-2)

        i = 2
        while i < n:
            dp[i] = max(dp[i-2], dp[i-3]) + nums[i]
            i += 1

        return max(dp[-1], dp[-2])

        # 3-liner
        # base case: f(0) = nums[0]
        # f(1) = max(nums[0], nums[1])
        # f(k) = max(f(k-2) +nums[k], f(k-1))
        # prev = curr = 0
        # for num in nums:
        #     temp = prev # (k-2) value
        #     prev = curr # (k-1) value
        #     curr = max(temp +num, prev)

        # return curr

        # Time Complexity - trasverse once - O(n)
        # Space Complexity -store constants - O(1)