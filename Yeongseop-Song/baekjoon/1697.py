# boj 1697 숨바꼭질 s1
# noj.am/1697
from collections import deque

N, K = map(int, input().split())
visited = [-1] * 100001  # -1이면 방문하지 않은 것

dq = deque()
dq.append(N)
visited[N] = 0

while dq:  # bfs로 최단거리 찾기
    now = dq.popleft()
    if now - 1 > -1 and visited[now - 1] == -1:  # -1 이동
        visited[now - 1] = visited[now] + 1
        dq.append(now - 1)
    if now + 1 < 100001 and visited[now + 1] == -1:  # +1 이동
        visited[now + 1] = visited[now] + 1
        dq.append(now + 1)
    if now * 2 < 100001 and visited[now * 2] == -1:  # *2 순간이동
        visited[now * 2] = visited[now] + 1
        dq.append(now * 2)

print(visited[K])
