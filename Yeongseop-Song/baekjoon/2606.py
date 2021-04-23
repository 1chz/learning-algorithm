# boj 2606 바이러스 s3
# noj.am/2606

v = int(input())
e = int(input())
graph = [[] for _ in range(v + 1)]
visited = [False] * (v + 1)
cnt = 0

for _ in range(e):  # 양방향 그래프 추가
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)


def dfs(x):
    global cnt  # 결과값 카운트
    visited[x] = True

    for node in graph[x]:
        if not visited[node]:
            dfs(node)
            cnt += 1
    return cnt


print(dfs(1))
