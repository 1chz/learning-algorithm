from typing import List


# https://leetcode.com/problems/3sum/
class Solution:


    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []

        for i in range(len(nums) - 2):
            if nums[i] == nums[i - 1] and i > 0:
                continue
            for j in range(i + 1, len(nums) - 1):
                if nums[j] == nums[j - 1] and j > i + 1:
                    continue
                for k in range(j + 1, len(nums)):
                    if k > j + 1 and nums[k] == nums[k - 1]:
                        continue
                    if nums[i] + nums[j] + nums[k] == 0:
                        result.append((nums[i], nums[j], nums[k]))

        return result


if __name__ == "__main__":
    rs = Solution()
    nums: List[str] = [-1, 0, 1, 2, -1, -4]
    print(rs.threeSum(nums))
