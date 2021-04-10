# 줄 세우기
from collections import deque

n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
in_degree = [0] * (n + 1)
queue = deque()

for i in range(m):
    a, b = map(int, input().split())
    in_degree[b] += 1
    graph[a].append(b)

for i in range(1, n+1):
    if in_degree[i] == 0:
        queue.append(i)

while queue:
    student = queue.popleft()
    for s in graph[student]:
        in_degree[s] -= 1
        if in_degree[s] == 0:
            queue.append(s)
    print(student, end=' ')
