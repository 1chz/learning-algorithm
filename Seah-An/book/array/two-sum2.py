from typing import List



def twoSum(nums: List[str], target: int) -> List[str]:
    nums_dic = {}

    for i, num in enumerate(nums):
        if target - num in nums_dic:
            return [nums_dic[target-num],i]
        nums_dic[num] = i



if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    print(twoSum(nums, target))
