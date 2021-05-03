# boj 2667 단지번호붙이기 s1
# noj.am/2667

N = int(input())
graph = [list(map(int, input())) for _ in range(N)]
visited = [[False] * N for _ in range(N)]
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
component = []


def dfs(x, y, idx):
    visited[x][y] = True
    component[idx] += 1  # 단지내 집의 수 카운트

    for i in range(4):  # 상하좌우 네방향 탐색
        X, Y = x + dx[i], y + dy[i]
        if -1 < X < N and -1 < Y < N:  # 배열 범위를 벗어나지 않았다면
            if not visited[X][Y] and graph[X][Y] == 1:
                dfs(X, Y, idx)


for i in range(N):
    for j in range(N):
        if not visited[i][j] and graph[i][j] == 1:
            component.append(0)  # 단지수 0으로 초기화
            dfs(i, j, len(component) - 1)  # 인덱스이므로 길이 - 1

print(len(component), *sorted(component), sep="\n")
