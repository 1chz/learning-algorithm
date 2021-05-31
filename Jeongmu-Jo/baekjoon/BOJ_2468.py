import sys
sys.setrecursionlimit(100000)

N = int(input())
lst = [list(map(int, input().split())) for _ in range(N)]
ans = 0
dx, dy = [0, -1, 0, 1], [-1, 0, 1, 0]

def dfs(i, j, k):
    for w in range(4):
        xx, yy = i + dx[w], j + dy[w]
        if xx <0 or xx >=N or yy < 0 or yy >= N:
            continue
        elif ck[xx][yy] == 0 and lst[i][j] > k:
            ck[xx][yy] = 1
            dfs(xx,yy,k)

for k in range(max(map(max, lst))):
    ck = [[0 for i in range(N)] for _ in range(N)]
    safe = 0
    for i in range(N):
        for j in range(N):
            if lst[i][j] > k and ck[i][j] == 0:
                safe += 1
                ck[i][j] = 1
                dfs(i, j, k)
    ans = max(ans, safe)

print(ans)
#feat(Jeongmu-Jo): [BOJ, 2468] 안전 영역