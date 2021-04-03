# O(n^2) two pointer solution

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        def plus_left(left: int) -> int:
            init_val = nums[left]
            while left < len(nums) and nums[left] == init_val:
                left += 1
            return left

        def minus_right(right: int) -> int:
            init_val = nums[right]
            while 0 <= right and nums[right] == init_val:
                right -= 1
            return right

        if len(nums) < 3:
            return []

        nums.sort()
        result = list()

        for i in range(len(nums)):
            if 0 < i and nums[i - 1] == nums[i]:
                continue
            left, right = i + 1, len(nums) - 1
            while left < right:
                if i == left:
                    left = plus_left(left)
                    continue
                if i == right:
                    right = minus_right(right)
                    continue

                if nums[i] + nums[left] + nums[right] == 0:
                    result_item = [nums[i], nums[left], nums[right]]
                    result.append(result_item)
                    left = plus_left(left)
                    right = minus_right(right)
                elif nums[left] + nums[right] + nums[i] < 0:
                    left = plus_left(left)
                else:
                    right = minus_right(right)

        return result