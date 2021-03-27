from collections import deque


class Solution:
    # time complexity: O(n!), space complexity: O(n)
    # Runtime: 44 ms, faster than 41.55% of Python3
    # Memory Usage: 14.4 MB, less than 46.67% of Python3
    def permute(self, nums: List[int]) -> List[List[int]]:
        result, candidate_queue = list(), deque([([], nums)])

        while candidate_queue:
            c_tuple = candidate_queue.popleft()
            current, candidates = c_tuple[0], c_tuple[1]

            if not candidates:
                result.append(current)
                continue

            for i, v in enumerate(candidates):
                candidate_queue.append((current + [v], candidates[:i] + candidates[i + 1:]))

        return result
