# time complexity: O(n**target), space complexity: O(target)
# Runtime: 120 ms, faster than 24.93% of Python3
# Memory Usage: 14.5 MB, less than 25.86% of Python3

class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result_list = list()
        candidates.sort()

        def rec(current_list: list, current_sum: int, last_elm: int) -> None:
            if target < current_sum:
                return
            elif target == current_sum:
                result_list.append(list(current_list))
                return

            for c in [c for c in candidates if last_elm <= c]:
                rec(current_list + [c], current_sum + c, c)

        if not candidates:
            return []

        rec([], 0, candidates[0])

        return list(result_list)