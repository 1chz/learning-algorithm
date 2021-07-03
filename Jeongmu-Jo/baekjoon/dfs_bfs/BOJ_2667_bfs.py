from collections import deque
n = int(input())
apt = [list(map(int, input())) for _ in range(n)]

visited = [[0 for i in range(n)] for _ in range(n)]
dx, dy = [0, -1, 0, 1], [1, 0, -1, 0]
cnt = 0
def bfs(x, y):
    global cnt
    q = deque()
    q.append((x,y))
    visited[x][y] = 1
    while q:
        x, y = q.popleft()

        for w in range(4):
            nx, ny = x + dx[w], y + dy[w]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if apt[nx][ny] == 1 and visited[nx][ny] == 0:
                q.append((nx,ny))
                visited[nx][ny] = 1
                cnt += 1

ans = []

for i in range(n):
    for j in range(n):
        if apt[i][j] == 1 and visited[i][j] == 0:
            cnt += 1
            bfs(i,j)
            ans.append(cnt)
            cnt = 0

ans.sort()
print(len(ans))
for i in ans:
    print(i)
#feat(Jeongmu-Jo): [BOJ, 2667] 단지번호붙이기_bfs
