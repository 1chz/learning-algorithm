class Solution:
    def rob(self, nums:List[int]) -> int:
        if len(nums) <= 2:
            return max(nums)

        prev1 =curr1 = prev2 = curr2 = 0

        for num in nums[:-1]:
            prev1, curr1 = curr1, max(num + prev1, curr1)

        for num in nums[1:]:
            prev2, curr2 = curr2, max(num + prev2, curr2)

        return max(curr1, curr2)

    # time complexity - traverse twice- O(n)
    # space complexity - constants -O(1)