import sys
sys.setrecursionlimit(10000)

dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]

def dfs(x, y):
    ck[x][y] = 1
    for w in range(4):
        nx, ny = x + dx[w], y + dy[w]
        if nx < 0 or nx >= N or ny < 0 or ny >= M:
            continue
        if B[nx][ny] and ck[nx][ny] == 0:
            dfs(nx,ny)

for _ in range(int(input())):
    M, N, K = map(int, input().split())

    B = [[0]*M for _ in range(N)]
    ck = [[0]*M for _ in range(N)]
    for _ in range(K):
        i, j = map(int, input().split())
        B[j][i] = 1
    ans = 0
    for i in range(N):
        for j in range(M):
            if B[i][j] == 1 and ck[i][j] == 0:
                dfs(i,j)
                ans += 1
    print(ans)