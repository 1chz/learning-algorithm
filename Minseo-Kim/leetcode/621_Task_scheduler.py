from heapq import heapify, heappop, heappush
from collections import deque, Counter

# O(nlogn) solution
# Runtime: 648 ms, faster than 18.48% of Python3
# Memory Usage: 15 MB, less than 24.50% of Python3
class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        result, next_task_q, n_count, working_q = 0, list(), 0, list()
        for task, count in Counter(tasks).items():
            next_task_q.append([count * -1, task])
        heapify(next_task_q)

        while next_task_q or working_q:
            n_count += 1
            result += 1

            if next_task_q:
                todo = heappop(next_task_q)
                if todo[0] < -1:
                    working_q.append([todo[0] + 1, todo[1]])

            if n_count == n + 1:
                for q in working_q:
                    heappush(next_task_q, q)
                n_count, working_q = 0, []

        return result
