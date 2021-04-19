# 전쟁 - 전투
from collections import deque

dx_li = [1, -1, 0, 0]
dy_li = [0, 0, 1, -1]

n, m = map(int, input().split())
board = [list(input().strip()) for _ in range(m)]
visited = [[0] * n for _ in range(m)]
w_sum = b_sum = 0

def bfs(x, y):
    q = deque()
    q.append((x, y))
    visited[x][y] = 1
    cnt = 1
    while q:
        x, y = q.popleft()
        for dx, dy in zip(dx_li, dy_li):
            nx, ny = x+dx, y+dy
            if 0 <= nx < m and 0 <= ny < n:
                if board[nx][ny] == board[x][y] and visited[nx][ny] == 0:
                    visited[nx][ny] = 1
                    q.append((nx, ny))
                    cnt += 1
    return cnt

for i in range(m):
    for j in range(n):
        if visited[i][j] == 0:
            ans = bfs(i, j)
            if board[i][j] == 'W':
                w_sum += ans ** 2
            else:
                b_sum += ans ** 2
print(w_sum, b_sum)