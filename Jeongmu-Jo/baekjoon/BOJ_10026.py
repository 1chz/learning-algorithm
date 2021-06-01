import sys
sys.setrecursionlimit(100000)

N = int(input())
lst = [list(map(str, input())) for _ in range(N)]
dx, dy = [0, -1, 0, 1], [-1, 0, 1, 0]
ck = [[0 for i in range(N)] for _ in range(N)]
cnt_1 = 0
cnt_2 = 0

def dfs(i, j, str):
    ck[i][j] = 1
    for w in range(4):
        ii, jj = i + dx[w], j + dy[w]
        if ii < 0 or ii >= N or jj < 0 or jj >=N:
            continue
        elif ck[ii][jj] == 0 and lst[ii][jj] == str:
            dfs(ii, jj, str)

for i in range(N):
    for j in range(N):
        if ck[i][j] == 0 and lst[i][j] == 'R':
            dfs(i, j, 'R')
            cnt_1 += 1
        elif ck[i][j] == 0 and lst[i][j] == 'G':
            dfs(i, j, 'G')
            cnt_1 += 1
        elif ck[i][j] == 0 and lst[i][j] == 'B':
            dfs(i, j, 'B')
            cnt_1 += 1

ck = [[0 for i in range(N)] for _ in range(N)]

for i in range(N):
    for j in range(N):
        if lst[i][j] == 'G':
            lst[i][j] = 'R'

for i in range(N):
    for j in range(N):
        if ck[i][j] == 0 and lst[i][j] == 'R':
            dfs(i, j, 'R')
            cnt_2 += 1
        elif ck[i][j] == 0 and lst[i][j] == 'B':
            dfs(i, j, 'B')
            cnt_2 += 1

print(cnt_1, cnt_2)
#feat(Jeongmu-Jo): [BOJ, 10026] 적록색약