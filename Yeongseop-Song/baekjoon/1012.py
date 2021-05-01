# boj 1012 유기농 배추 s2
# noj.am/1012

from collections import deque


def bfs(x, y):
    dq = deque()
    dq.append((x, y))
    visited[x][y] = True
    while dq:
        x, y = dq.popleft()
        for i in range(4):
            X, Y = x + dx[i], y + dy[i]
            # 범위안에 있고 배추가 있고(1) 방문하지 않았을 때
            if 0 <= X < N and 0 <= Y < M and not visited[X][Y] and bachu[X][Y]:
                dq.append((X, Y))
                visited[X][Y] = True


T = int(input())
for _ in range(T):
    M, N, K = map(int, input().split())
    graph = [list(map(int, input().split())) for _ in range(K)]
    # 배추가 있는 좌표는 1로 없는 곳은 0으로 그래프를 만듬
    bachu = [[1 if [i, j] in graph else 0 for i in range(M)] for j in range(N)]
    '''
    for i in range(N):
        for j in range(M):
            if [i, j] in graph:
                bachu[i][j] = 1
            else:
                bachu[i][j] = 0
    '''
    visited = [[False] * M for _ in range(N)]
    dx = [1, -1, 0, 0]
    dy = [0, 0, 1, -1]
    cnt = 0

    for y, x in graph:  # 연결 요소의 갯수 = 답, x와 y 주의
        if not visited[x][y] and bachu[x][y]:
            bfs(x, y)
            cnt += 1

    print(cnt)
