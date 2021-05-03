from itertools import combinations
from collections import deque

def bfs(candidate):
    q = deque()
    exp_time = [[-1] * n for _ in range(n)]
    
    for x, y in candidate:
        q.append((x,y))
        exp_time[x][y] = 0
    max_dist = 0
    while q:
        x, y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx, ny = x + dx, y + dy
            if 0 <= nx < n and 0 <= ny < n and arr[nx][ny] != 1 and exp_time[nx][ny] == -1:
                exp_time[nx][ny] = exp_time[x][y] + 1
                if arr[nx][ny] == 0:
                    max_dist = max(max_dist, exp_time[nx][ny])    
                q.append((nx,ny))

    a = list(sum(exp_time, []))
    if a.count(-1) == list(sum(arr, [])).count(1):
        ans.append(max_dist)
        

n,m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
virus = []
for i in range(n):
    for j in range(n):
        if arr[i][j] == 2:
            virus.append((i,j))

dxs = [-1, 0, 1, 0]
dys = [0, -1, 0, 1]

ans = []
min_value = 1e9
for candidate in list(combinations(virus, m)):
    bfs(candidate)
print(min(ans) if ans else -1)