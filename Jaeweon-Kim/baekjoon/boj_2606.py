# 바이러스
from collections import deque

n = int(input())
m = int(input())
visited = []
graph = [[] for _ in range(n+1)]
for i in range(m):
    a, b = map(int ,input().split())
    graph[a].append(b)
    graph[b].append(a)

q = deque()
q.append(1)
while q:
    x = q.popleft()
    for i in graph[x]:
        if i not in visited:
            visited.append(i)
            q.append(i)

print(len(visited)-1)
