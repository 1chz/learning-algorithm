# boj 11724 연결 요소의 개수 s2
# noj.am/11724
import sys

inp = sys.stdin.readline
N, M = map(int, inp().split())
graph = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)
ans = 0

# 무방향 그래프 입력
for i in range(M):
    x, y = map(int, inp().split())
    graph[x].append(y)
    graph[y].append(x)


def dfs(x):
    visited[x] = True
    for node in graph[x]:
        if not visited[node]:
            dfs(node)


for i in range(1, N + 1):  # 연결 요소의 갯수 파악
    if not visited[i]:    # dfs에 의해서 연결된 요소들은 쭉 방문한다. 연결되지 않았을 때만 ans++
        ans += 1
        dfs(i)

print(ans)
