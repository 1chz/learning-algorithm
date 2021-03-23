class Solution:
    # time: O(n) space: O(1)
    # Runtime 228 ms, faster than 95.40% of Python3
    # Memory Usage: 21.3 MB, less than 53.83% of Python3
    def productExceptSelf(self, nums: list) -> list:
        total_product, zero_counts = 1, []
        for i, v in enumerate(nums):
            if v != 0:
                total_product *= v
            else:
                zero_counts.append(i)

        if 1 < len(zero_counts):
            return [0 * len(nums) for _ in nums]
        elif 1 == len(zero_counts):
            result = [0 * len(nums) for _ in nums]
            result[zero_counts[0]] = total_product
            return result

        result = list()
        for i in nums:
            result.append(int(total_product / i))
        return result


def main():
    solution = Solution()
    assert (solution.productExceptSelf([1, 2, 3, 4]) == [24, 12, 8, 6])
    assert (solution.productExceptSelf([-1, 1, 0, -3, 3]) == [0, 0, 9, 0, 0])
