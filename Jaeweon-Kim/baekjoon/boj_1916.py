# 최소비용 구하기
from heapq import heappush, heappop
INF = int(1e9)

def dijkstra(n, start, end, graph):
    q = []
    dist = [INF] * (n+1)
    dist[start] = 0
    heappush(q, [start, 0])

    while q:
        pos, cost = heappop(q)
        for p, c in graph[pos]:
            c += cost
            if c < dist[p]:
                dist[p] = c
                heappush(q, [p, c])
    return dist[end]

n = int(input())
m = int(input())
graph = [[] for _ in range(n+1)]
for i in range(m):
    a, b, c = map(int, input().split())
    graph[a].append([b,c])

start, end = map(int, input().split())
print(dijkstra(n, start, end, graph))
