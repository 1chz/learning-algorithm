# 뿌요뿌요 (Puyo Puyo)
from collections import deque

dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]

def bfs(x, y, flag):
    q = deque()
    visited = [[0]*6 for _ in range(12)]
    q.append([x, y])
    cnt = 1
    visited[x][y] = 1
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < 12 and 0 <= ny < 6:
                if board[nx][ny] == board[x][y] and not visited[nx][ny]:
                    cnt += 1
                    visited[nx][ny] = 1
                    q.append([nx, ny])

    if cnt >= 4:
        flag += 1
        for i in range(12):
            for j in range(6):
                if visited[i][j] == 1:
                    board[i][j] = '.'
    
    return flag

def check_fall():
    for i in range(10, -1, -1):
        for j in range(6):
            if board[i][j] != '.' and board[i+1][j] == '.':
                for k in range(i+1, 12):
                    if k == 11 and board[k][j] == '.':
                        board[k][j] = board[i][j]
                    elif board[k][j] != '.':
                        board[k-1][j] = board[i][j]
                        break
                board[i][j] = '.'
                    

board = []
for _ in range(12):
    board.append(list(input()))

ans = 0
while True:
    cnt = 0
    for i in range(12):
        for j in range(6):
            if board[i][j] != '.':
                cnt = bfs(i, j, cnt)
    
    if cnt == 0:
        print(ans)
        break
    else:
        ans += 1

    check_fall()