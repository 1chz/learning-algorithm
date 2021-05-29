from collections import deque
import sys

input = sys.stdin.readline


# 특이사항: 나아갈 방향에 대각선도 포함해줘야함
dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]
# 1은 땅 0은 바다
while True:
    Graph = []
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    for _ in range(h):
        line = list(map(int, input().split()))
        Graph.append(line)

    q = deque()
    cnt = 0
    for i in range(h):
        for j in range(w):
            if Graph[i][j] == 1:
                q.append((i, j))
                Graph[i][j] = 2

                while q:
                    x, y = q.popleft()

                    for k in range(8):
                        nx = x + dx[k]
                        ny = y + dy[k]
                        if 0 <= nx < h and 0 <= ny < w:
                            if Graph[nx][ny] == 1:
                                q.append((nx, ny))
                                Graph[nx][ny] = 2
                else:
                    cnt += 1

    print(cnt)
