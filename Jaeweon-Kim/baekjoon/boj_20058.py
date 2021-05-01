# 마법사 상어와 파이어스톰
import sys
input = sys.stdin.readline
sys.setrecursionlimit(20000)
n, q = map(int, input().split())
n = 2**n

ice = [list(map(int, input().split())) for _ in range(n)]
dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]

for qq in list(map(int, input().split())):
    k = 2 ** qq
    for x in range(0, n, k):
        for y in range(0, n, k):
            temp = [ice[i][y:y+k] for i in range(x, x+k)]
            for i in range(k):
                for j in range(k):
                    ice[x+j][y+k-1-i] = temp[i][j]

    cnt = [[0] * n for _ in range(n)]
    for x in range(n):
        for y in range(n):
            for i in range(4):
                nx, ny = x + dx[i], y + dy[i]
                if 0 <= nx < n and 0 <= ny < n and ice[nx][ny]:
                    cnt[x][y] += 1

    for x in range(n):
        for y in range(n):
            if ice[x][y] > 0 and cnt[x][y] < 3:
                ice[x][y] -= 1

print(sum(sum(r) for r in ice))
    
# print(ice)

def dfs(x, y):
    piece = 1
    ice[x][y] = 0
    visited[x][y] = 1
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < n and ice[nx][ny] and not visited[nx][ny]:
            piece += dfs(nx, ny)
    return piece

ans = 0
visited = [[0] * n for _ in range(n)]
for x in range(n):
    for y in range(n):
        if ice[x][y] > 0 and not visited[x][y]:
            ans = max(ans, dfs(x, y))
print(ans)