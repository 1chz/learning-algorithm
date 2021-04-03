# 1st solution: brute force O(n^2)
# 2nd solution: sort -> narrow down the range until target sum be found. O(nlogn)
# 3rd solution: hash table O(n)

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        sorted_nums = sorted(nums)

        left, right = 0, len(nums) - 1

        while left < right:
            nums_sum = sorted_nums[left] + sorted_nums[right]
            if nums_sum == target:
                break
            elif nums_sum < target:
                left += 1
            else:
                right -= 1

        l = nums.index(sorted_nums[left])
        r = nums.index(sorted_nums[right])

        for i, v in enumerate(nums):
            if v == sorted_nums[right] and i != l:
                return [l, i]

        return [l, r]


from collections import defaultdict


class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        index_table = defaultdict(list)
        for i, v in enumerate(nums):
            index_table[v].append(i)

        for i, num in enumerate(nums):
            if (target - num) in nums[:i] + nums[i + 1:]:
                return [index_table[num].pop(), index_table[target - num].pop()]
