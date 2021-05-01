from collections import deque

N = int(input())
Graph = [list(input()) for _ in range(N)]
visited = [[False] * N for _ in range(N)]

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

not_rg = 0
rg = 0


def bfs(x1, y1):
    q = deque()
    q.append((x1, y1))
    visited[x1][y1] = True

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < N:
                if visited[nx][ny] == False and Graph[nx][ny] == Graph[x][y]:
                    visited[nx][ny] = True
                    q.append((nx, ny))


for i in range(N):
    for j in range(N):
        if visited[i][j] == False:
            not_rg += 1
            bfs(i, j)

for i in range(N):
    for j in range(N):
        if Graph[i][j] == 'R':
            Graph[i][j] = 'G'

# 초기화
visited = [[False] * N for _ in range(N)]

for i in range(N):
    for j in range(N):
        if visited[i][j] == False:
            rg += 1
            bfs(i,j)

print(not_rg,rg)