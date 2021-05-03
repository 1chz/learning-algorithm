# 어른 상어
import sys

input = sys.stdin.readline
dx = [0, -1, 1, 0, 0]
dy = [0, 0, 0, -1, 1]
# 배열 수, 상어 수, 냄새 퍼지는 수 입력
n, m, k = map(int, input().split())
# 기본 배열과 상어 정보 입력
board, shark = [], [[] for _ in range(m)]
for i in range(n):
    board.append(list(map(int, input().split())))
    for j in range(n):
        if board[i][j]:
            shark[board[i][j]-1].extend([i, j])
            board[i][j] = [board[i][j], k]
# 처음 배치된 상어들이 가르키는 방향 입력
d = list(map(int, input().split()))
for i in range(m):
    shark[i].append(d[i])
# 각 방향의 우선순위 방향들 정보 입력
dir = [[] for _ in range(m)]
idx = -1
for i in range(4*m):
    if i % 4 == 0:
        idx += 1
    dir[idx].append(list(map(int, input().split())))

ans = 0
while True: # 1번의 상어만이 남을때까지 걸리는 시간 구하기 (ans < 1001)
    ans += 1
    if ans == 1001:
        print(-1)
        break
    # 방문한곳인지 체크
    check = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(m):
        if shark[i] != 0:
            x, y, d, flag = shark[i][0], shark[i][1], shark[i][2], 0
            for j in range(4): # 가려는 방향이 비어 있는지 체크
                ndir = dir[i][d-1][j]
                nx, ny = x + dx[ndir], y + dy[ndir]
                if 0 <= nx < n and 0 <= ny < n:
                    if board[nx][ny] == 0:
                        flag = 1
                        break
        # 4방향 모두 비어있는 곳이 없을 경우 본인 냄새가 있는곳을 찾아서 돌아가기
            if flag == 0:
                for j in range(4):
                    ndir = dir[i][d-1][j]
                    nx, ny = x + dx[ndir], y + dy[ndir]
                    if 0 <= nx < n and 0 <= ny < n:
                        if board[nx][ny][0] == i+1:
                            break

            if check[nx][ny]:
                if check[nx][ny] < i+1:
                    shark[i] = 0
                else:
                    shark[check[nx][ny] - 1] = 0
                    check[nx][ny] = i + 1
                    shark[i] = [nx, ny, ndir]
            else:
                check[nx][ny] = i+1
                shark[i] = [nx, ny, ndir]

    for i in range(n):
        for j in range(n):
            if board[i][j]:
                board[i][j][1] -= 1
                if board[i][j][1] == 0:
                    board[i][j] = 0

    for i in range(m):
        if shark[i]:
            x, y = shark[i][0], shark[i][1]
            board[x][y] = [i+1, k]

    if shark.count(0) == m-1:
        print(ans)
        break