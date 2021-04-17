# boj 1260 DFS와 BFS
# noj.am/1260 s2
import sys
from collections import deque

inp = sys.stdin.readline
N, M, V = map(int, inp().split())
graph = [[] for _ in range(N + 1)]
visitedDFS = [False] * (N + 1)
visitedBFS = [False] * (N + 1)
resDFS = []
resBFS = []

# 양방향 그래프 입력
for _ in range(M):
    x, y = map(int, inp().split())
    graph[x].append(y)
    graph[y].append(x)

# 정점 번호가 작은 것 부터 방문하므로
for i in graph:
    i.sort()


def dfs(x):
    visitedDFS[x] = True
    resDFS.append(x)
    for node in graph[x]:
        if not visitedDFS[node]:
            dfs(node)
    return resDFS


def bfs(x):
    dq = deque([x])
    visitedBFS[x] = True
    while dq:
        v = dq.popleft()
        resBFS.append(v)
        for node in graph[v]:
            if not visitedBFS[node]:
                dq.append(node)
                visitedBFS[node] = True
    return resBFS


print(*dfs(V))
print(*bfs(V))
