# Runtime: 52 ms, faster than 32.67% of Python3
# Memory Usage: 14.5 MB, less than 7.78% of Python3

class Solution:
    # merge_sort O(nlogn) solution
    def largestNumber(self, nums: List[int]) -> str:
        def swapable(a: int, b: int) -> bool:
            if int(str(a) + str(b)) < int(str(b) + str(a)):
                return True
            return False

        def merge_sort(nums: List[int]) -> list:
            # divide
            if len(nums) == 1:
                return nums

            mid = len(nums) // 2
            left = merge_sort(nums[:mid])
            right = merge_sort(nums[mid:])

            # conquer
            result = list()
            while left and right:
                if swapable(left[0], right[0]):
                    result.append(right.pop(0))
                else:
                    result.append(left.pop(0))

            if left:
                result += left
            if right:
                result += right

            return result

        result = merge_sort(nums)
        if result[0] == 0:
            return "0"

        return "".join([str(i) for i in result])


