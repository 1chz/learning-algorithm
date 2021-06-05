# boj 4963 섬의 개수 s2
# noj.am/4963
dx = [1, -1, 0, 0, 1, 1, -1, -1]  # 동서남북대각선
dy = [0, 0, 1, -1, 1, -1, 1, -1]


def dfs(x, y):
    visited[x][y] = True
    for i in range(8):  # 8방향 탐
        X, Y = x + dx[i], y + dy[i]
        # 범위를 벗어나지않고 방문하지 않았고 1일
        if 0 <= X < h and 0 <= Y < w and not visited[X][Y] and island[X][Y]:
            dfs(X, Y)


while True:
    w, h = map(int, input().split())
    if w == 0 and h == 0:  # eof
        break
    cnt = 0
    visited = [[False] * w for _ in range(h)]
    island = [list(map(int, input().split())) for _ in range(h)]
    for i in range(h):  # 연결 갯수를 세준다
        for j in range(w):
            if not visited[i][j] and island[i][j]:
                cnt += 1
                dfs(i, j)
    print(cnt)
