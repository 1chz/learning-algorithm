from typing import List



def twoSum(nums: List[str], target: int) -> List[str]:
    left, right = 0, len(nums) - 1
    while not left==right:
        if nums[left] + nums[right] < target:
            left += 1
        elif nums[left] + nums[right] > target:
            right -=1
        else:
            return left,right


if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    print(twoSum(nums, target))
