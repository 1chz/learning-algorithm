# 미로 탐색
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# dfs 로 풀경우 시간 초과
def dfs(x, y):
    global cnt, answer
    if x == n-1 and y == m-1:
        answer = min(answer, cnt)
        return
    else:
        for dx_i, dy_i in zip(dx, dy):
            nx, ny = x + dx_i, y + dy_i
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == '1':
                if visited[nx][ny] == 0:
                    visited[nx][ny] = 1
                    cnt += 1
                    dfs(nx, ny)
                    cnt -= 1
                    visited[nx][ny] = 0

from collections import deque
def bfs():
    q = deque([(0,0)])
    visited[0][0] = 1
    while q:
        x, y = q.popleft()
        if x == n-1 and y == m-1:
            print(visited[x][y])
            break
        for dx_i, dy_i in zip(dx,dy):
            nx, ny = x + dx_i, y + dy_i
            if 0 <= nx < n and 0 <= ny < m:
                if visited[nx][ny] == 0 and graph[nx][ny] == '1':
                    visited[nx][ny] = visited[x][y] + 1
                    q.append((nx, ny))

n, m = map(int, input().split())
graph = [list(input().strip()) for _ in range(n)]
visited = [[0] * m for _ in range(n)]
answer = int(1e9)
cnt = 1
bfs()