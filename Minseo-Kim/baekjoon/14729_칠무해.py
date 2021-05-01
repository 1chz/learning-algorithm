# Time Complexity O(n)
# Space Complexity O(1)

from heapq import heappush, heappop
import sys

q = []
q_max = float('inf')

input = sys.stdin.readline
N = int(input())

for _ in range(N):
    item = float(input()) * -1
    if len(q) < 7 or q_max < item:
        heappush(q, item)
        if 7 < len(q):
            heappop(q)
        q_max = min(q)

result = ['%.3f' % (heappop(q) * -1) for _ in range(7)][::-1]
for x in result:
    print(x)
