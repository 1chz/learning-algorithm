N = int(input())
home = [list(map(int,input())) for _ in range(N)]
ck = [[0 for i in range(N)] for _ in range(N)]
ans = [0 for i in range(N)]
nums = 0
dx, dy = [0, -1, 0, 1], [-1, 0, 1, 0]

def dfs(i, j):
    global nums
    if home[i][j] == 1 and ck[i][j] == 0:
        ck[i][j] = 1
        nums += 1
        for w in range(4):
            ii, jj = i + dx[w], j + dy[w]
            if ii < 0 or ii >= N or jj < 0 or jj >= N:
                continue
            elif ck[ii][jj] == 0 and home[ii][jj] == 1:
                dfs(ii, jj)

for i in range(N):
    for j in range(N):
        dfs(i, j)
        ans.append(nums)
        nums = 0
all = 0
ans.sort()
for i in range(len(ans)):
    if ans[i] > 0:
        all += 1
print(all)
for i in ans:
    if i > 0:
        print(i)
#feat(Jeongmu-Jo): [BOJ, 2667] 단지번호붙이기