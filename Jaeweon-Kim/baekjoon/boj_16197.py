# 두 동전

# 보드 가장자리에 0을 추가해서 좌표의 보드값이 0일 때 떨어진것으로 간주
from collections import deque

dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]

def sol():
    while q:
        x1, y1, x2, y2 = q.popleft()
        if visited[x1][y1][x2][y2] > 10: break
        for i in range(4):
            xx1, yy1 = x1 + dx[i], y1 + dy[i]
            xx2, yy2 = x2 + dx[i], y2 + dy[i]
            if board[xx1][yy1] == 0 and board[xx2][yy2] == 0:
                continue
            if board[xx1][yy1] == 0:
                return visited[x1][y1][x2][y2]
            if board[xx2][yy2] == 0:
                return visited[x1][y1][x2][y2]
            if board[xx1][yy1] == '#':
                xx1, yy1 = x1, y1
            if board[xx2][yy2] == '#':
                xx2, yy2 = x2, y2
            if not visited[xx1][yy1][xx2][yy2]:
                visited[xx1][yy1][xx2][yy2] = visited[x1][y1][x2][y2] + 1
                q.append([xx1, yy1, xx2, yy2])

    return -1

n, m = map(int, input().split())
board = [[0] * (m+2)]
for _ in range(n):
    board.append([0] + list(input()) + [0])
board.append([0] * (m+2))
coin = []
for i in range(n+2):
    for j in range(m+2):
        if board[i][j] == 'o':
            coin.append(i)
            coin.append(j)
            board[i][j] = '.'

# 동전이 방문했는지 확인하기 위한 4차원 배열 
visited = [ [ [ [0] * (m+2) for _ in range(n+2)] for _ in range(m+2)] for _ in range(n+2)]
visited[coin[0]][coin[1]][coin[2]][coin[3]] = 1
q = deque()
q.append([coin[0], coin[1], coin[2], coin[3]])
print(sol())
