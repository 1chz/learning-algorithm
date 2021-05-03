from collections import deque
n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]

now_x, now_y = 0, 0
baby_size = 2
for i in range(n):
    for j in range(n):
        if board[i][j] == 9:
            now_x, now_y = i, j
            board[i][j] = 0

dxs = [-1, 0, 1, 0]
dys = [0, -1, 0, 1]

def bfs():
    dist = [[-1]*n for _ in range(n)]
    q = deque([(now_x, now_y)])
    dist[now_x][now_y] = 0
    while q:
        x,y = q.popleft()
        for dx, dy in zip(dxs, dys):
            nx = dx + x
            ny = dy + y
            if 0 <= nx < n and 0 <= ny < n:
                if board[nx][ny] <= baby_size and dist[nx][ny] == -1:
                    q.append((nx,ny))
                    dist[nx][ny] = dist[x][y] + 1
    return dist

def find(dist):
    x, y = 0, 0
    min_dist = 1e9
    for i in range(n):
        for j in range(n):
            if dist[i][j] != -1 and 1 <= board[i][j] < baby_size:
                if dist[i][j] < min_dist:
                    min_dist = dist[i][j]
                    x,y = i,j
    if min_dist == 1e9:
        return None
    else:
        return x,y,min_dist

result = 0
ate = 0
while True:
    value = find(bfs())
    if value == None:
        print(result)
        break
    else:
        print(now_x, now_y)
        now_x, now_y = value[0], value[1]
        result += value[2]
        board[now_x][now_y] = 0
        ate += 1
        if ate == baby_size:
            baby_size += 1
            ate = 0