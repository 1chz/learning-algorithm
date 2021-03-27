# time, complexity O(2^n) solution
# Runtime: 24 ms, faster than 98.87% of Python3
# Memory Usage: 14.3 MB, less than 80.80%

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = list()

        def subset(current: list, candidates: list) -> None:
            if not candidates:
                result.append(current)
                return
            subset(current, candidates[1:])
            subset(current + [candidates[0]], candidates[1:])

        subset([], nums)

        return result
