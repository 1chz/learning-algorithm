# 단지번호붙이기

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def dfs(x, y):
    global nums
    
    visited[x][y] = 1
    if board[x][y] == 1:
        nums += 1
    
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < n and 0 <= ny < n:
            if visited[nx][ny] == 0 and board[nx][ny] == 1:
                dfs(nx, ny)

n = int(input())
board = [list(input().strip()) for _ in range(n)]
for i in range(n):
    for j in range(n):
        if board[i][j] == '1':
            board[i][j] = 1
        else:
            board[i][j] = 0
visited = [[0] * n for _ in range(n)]
town_list = []
nums = 0
for i in range(n):
    for j in range(n):
        if board[i][j] == 1 and visited[i][j] == 0:
            dfs(i, j)
            town_list.append(nums)
            nums = 0

print(len(town_list))
for n in sorted(town_list):
    print(n)

