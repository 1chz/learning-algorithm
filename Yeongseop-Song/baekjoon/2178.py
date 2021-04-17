# boj 2178 미로 탐색 s1
# noj.am/2178
from collections import deque

N, M = map(int, input().split())
maze = [list(map(int, input())) for _ in range(N)]
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
visited = [[False] * M for _ in range(N)]
cnt = 0


def bfs(x, y, cnt):
    dq = deque()
    dq.append((x, y))
    visited[x][y] = True
    cnt += 1
    while dq:
        if visited[N - 1][M - 1]:  # M, M 에 도착하면 끝
            return cnt
        l = len(dq)  # 큐의 길이만큼 돌아야 1회 수행한 것
        cnt += 1
        for _ in range(l):
            x, y = dq.popleft()
            for i in range(4):
                X, Y = x + dx[i], y + dy[i]
                # 범위를 벗어나지 않고 방문한적 없고 1일 경우에만
                if 0 <= X < N and 0 <= Y < M and maze[X][Y] and not visited[X][Y]:
                    dq.append((X, Y))
                    visited[X][Y] = True


print(bfs(0, 0, 0))
