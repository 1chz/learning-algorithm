# [start at] 20:15 [solved at] 20:30
# heapq solution
# time complexity: O(slog(s)) or O(glog(g)) linear solution
# space complexity: O(1)
from heapq import heapify, heappop, heappush


class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        result = 0
        g, s = [-1 * i for i in g], [-1 * i for i in s]
        heapify(g)
        heapify(s)

        while s and g:
            cookie, greed = heappop(s), heappop(g)
            if cookie <= greed:
                result += 1
            else:
                heappush(s, cookie)

        return result


# sort an array
# time complexity: O(slog(s)) or O(glog(g)) linear solution
# space complexity: O(1)
# 속도는 위 솔루션보다 더 잘 나오지만 결국 해법과 복잡도는 같음.
# Runtime: 156 ms, faster than 84.68% of Python3
# Memory Usage: 15.6 MB, less than 96.96% of Python3
class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        result = 0
        g.sort()
        s.sort()

        while s and g:
            cookie, greed = s.pop(), g.pop()
            if greed <= cookie:
                result += 1
            else:
                s.append(cookie)

        return result