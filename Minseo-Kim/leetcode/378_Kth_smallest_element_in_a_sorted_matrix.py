# 1st solution: put all elements into one array and heapify it so that the smallest element is to be popped out
# time complexity: O(n), space O(n)
# 2nd solution: divide and conquer (it's divided so perform only conquer for every two rows)
# time complexity: O(n), space O(n)

# Runtime: 184 ms, faster than 72.08% of Python3
# Memory Usage: 20.2 MB, less than 19.99% of Python3

from heapq import heapify, heappop


class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        n, priority_queue = len(matrix), list()

        for i in range(n):
            priority_queue += matrix[i]
        heapify(priority_queue)
        for i in range(k - 1):
            heappop(priority_queue)

        return heappop(priority_queue)
