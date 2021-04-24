# 음식물 피하기
from collections import deque
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    global max_val
    q = deque([(x, y)])
    cnt = 0
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x+dx[i], y+dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if visited[nx][ny] == 0 and board[nx][ny] == 1:
                    visited[nx][ny] = 1
                    q.append((nx, ny))
                    cnt += 1
    max_val = max(max_val, cnt)


n,m,k = map(int, input().split())
visited = [[0] * m for _ in range(n)]
board = [[0] * m for _ in range(n)]
for i in range(k):
    a, b = map(int, input().split())
    board[a-1][b-1] = 1

max_val = int(-1e9)
for i in range(n):
    for j in range(m):
        if visited[i][j] == 0 and board[i][j] == 1:
            bfs(i, j)

print(max_val)
