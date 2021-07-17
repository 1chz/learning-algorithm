from heapq import heappush, heappop
import sys
input = sys.stdin.readline
def distance(a, b, c, d):
    return ((a - c) ** 2 + (b - d) ** 2) ** 0.5
def dijkstra(start):
    heap = []
    heappush(heap, [0, start])
    dp = [100000000 for i in range(n + 2)]
    dp[start] = 0
    while heap:
        w, nu = heappop(heap)
        for ne, nw in s[nu]:
            wei = nw + w
            if dp[ne] > wei:
                dp[ne] = wei
                heappush(heap, [wei, ne])
    return dp
startX, startY = map(float, input().split())
desX, desY = map(float, input().split())
n = int(input())
s = [[] for i in range(n + 2)]
ca = [[startX, startY]]
for i in range(1, n + 1):
    x, y = map(float, input().split())
    ca.append([x, y])
    s[0].append([i, distance(x, y, startX, startY) / 5])
ca.append([desX, desY])
s[0].append([n + 1, distance(desX, desY, startX, startY) / 5])
for i in range(1, n + 1):
    cx, cy = ca[i][0], ca[i][1]
    for j in range(n + 2):
        x, y = ca[j][0], ca[j][1]
        if i != j:
            s[i].append([j, 2 + (abs(distance(x, y, cx, cy) - 50) / 5)])
dp = dijkstra(0)
print(dp[n + 1])