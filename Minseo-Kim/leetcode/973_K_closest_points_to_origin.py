# Runtime: 688 ms, faster than 53.97% of Python3
# Memory Usage: 19.8 MB, less than 59.45% of Python3

# 1st) brute force solution O(n)
# O(n) should be the most optiomal solution..

from heapq import heapify, heappop


class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        queue, result = list(), list()
        for point in points:
            distance = point[0] ** 2 + point[1] ** 2
            queue.append([distance, point])

        heapify(queue)

        for i in range(k):
            result.append(heappop(queue)[1])

        return result
