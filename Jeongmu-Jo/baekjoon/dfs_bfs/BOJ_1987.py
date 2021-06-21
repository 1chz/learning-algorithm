import sys
sys.setrecursionlimit(100000)

def dfs(x, y, ans):
    dx, dy = [0, -1, 0, 1], [-1, 0, 1, 0]
    global max_val
    max_val = max(max_val, ans)

    for w in range(4):
        nx, ny = x + dx[w], y + dy[w]
        if 0 > nx or nx >= R or 0 > ny or ny >= C:
            continue
        if alp[lst[nx][ny]] == 0:
            alp[lst[nx][ny]] = 1
            dfs(nx, ny, ans+1)
            alp[lst[nx][ny]] = 0

R, C = map(int, input().split())
lst = [list(map(lambda x: ord(x)-65, input())) for _ in range(R)]
alp = [0]*26
alp[lst[0][0]] = 1

max_val = 1
ans = 1
dfs(0, 0, ans)
print(max_val)
#..
#feat(Jeongmu-Jo): [BOJ, 1987] 알파벳
