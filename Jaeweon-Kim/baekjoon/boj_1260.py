# DFS와 BFS
from collections import deque

def dfs(v):
    visited[v] = 1
    print(v, end=' ')
    for i in sorted(graph[v]):
        if visited[i] == 0:
            dfs(i)

def bfs(v):
    q = deque([v])
    visited[v] = 0
    while q:
        v = q.popleft()
        print(v, end=' ')
        for i in sorted(graph[v]):
            if visited[i] == 1:
                q.append(i)
                visited[i] = 0

n, m, v = map(int, input().split())
graph = [[] for _ in range(n+1)]
visited = [0] * (n+1)
answer = []
for i in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

dfs(v)
print()
bfs(v)
