# 뱀
from collections import deque

N = int(input())
K = int(input())
board = [[0] * (N) for _ in range(N)]
for _ in range(K):
    a, b = map(int, input().split())
    board[a-1][b-1] = 1

L = int(input())
info = []
for _ in range(L):
    x, c = input().split()
    info.append((int(x), c))

dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]


def turn(d, c):
    if c == 'L':
        d = (d-1) % 4
    elif c == 'D':
        d = (d+1) % 4
    return d

def solve():
    x, y = 0, 0
    board[x][y] = 2
    direction = 0
    q = deque([(x, y)])
    time = 0
    index = 0

    while True:
        nx = x + dx[direction]
        ny = y + dy[direction]

        if 0 <= nx < N and 0 <= ny < N and board[nx][ny] != 2:
            if board[nx][ny] == 0:
                board[nx][ny] = 2
                q.append((nx,ny))
                qx, qy = q.popleft()
                board[qx][qy] = 0
            
            elif board[nx][ny] == 1:
                board[nx][ny] = 2
                q.append((nx, ny))

        else:
            time += 1
            break

        time += 1
        x, y = nx, ny
        if index < L and time == info[index][0]:
            direction = turn(direction, info[index][1])
            index += 1

    return time
    
print(solve())