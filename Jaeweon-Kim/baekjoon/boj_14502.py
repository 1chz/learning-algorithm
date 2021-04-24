# 연구소

N, M = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(N)]
check = [[0] * M for _ in range(N)]
dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]
result = 0

def spread(x, y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < N and 0 <= ny < M and check[nx][ny] == 0:
            check[nx][ny] = 2
            spread(nx, ny)

def get_score():
    score = 0
    for i in range(N):
        for j in range(M):
            if check[i][j] == 0:
                score += 1
    return score

def dfs(cnt):
    global result
    if cnt == 3:
        for i in range(N):
            for j in range(M):
                check[i][j] = board[i][j]
        
        for i in range(N):
            for j in range(M):
                if check[i][j] == 2:
                    spread(i, j)
        result = max(result, get_score())
        return

    for i in range(N):
        for j in range(M):
            if board[i][j] == 0:
                board[i][j] = 1
                cnt += 1
                dfs(cnt)
                board[i][j] = 0
                cnt -= 1

dfs(0)
print(result)