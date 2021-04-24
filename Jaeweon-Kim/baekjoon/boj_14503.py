# 로봇청소기
from collections import deque

N, M = map(int, input().split())
x, y, d = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(N)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
board[x][y] = 2
result = 1

def bfs(x, y, d):
    global result
    while True:
        check = False
        for i in range(4):
            d = (d + 3) % 4
            nx, ny = x + dx[d], y + dy[d]
            
            if board[nx][ny] == 0:
                board[nx][ny] = 2
                result += 1
                x, y = nx, ny
                check = True
                break

        if not check:
            if board[x-dx[d]][y-dy[d]] == 1:
                return
            else:
                x, y = x - dx[d], y - dy[d]

bfs(x, y, d)
print(result)