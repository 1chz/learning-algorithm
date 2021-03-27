class Solution:
    # time complexity: O(n!/(n-k)!k!), space complexity: O(k)
    # if candidates exists and if len(created combination) is less than k, call recursive function
    # Runtime: 552 ms, faster than 32.01% of Python3
    # Memory Usage: 15.7 MB, less than 81.00% of Python3
    class Solution:
        def combine(self, n: int, k: int) -> List[List[int]]:
            result = list()

            def combine_recursively(current_list: list, candidates: list) -> None:
                if len(current_list) == k:
                    result.append(current_list)
                    return
                if not candidates:
                    return

                for i, v in enumerate(candidates):
                    combine_recursively(current_list + [v], candidates[i + 1:])

            init_candidates = [i for i in range(1, n + 1)]
            combine_recursively([], init_candidates)
            return result