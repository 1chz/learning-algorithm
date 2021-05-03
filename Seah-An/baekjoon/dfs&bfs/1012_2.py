from collections import deque
import sys
input = sys.stdin.readline

dx = [-1,1,0,0]
dy = [0,0,-1,1]


def bfs(graph,x,y):
    q = deque()
    q.append((x,y))
    while q:
        x1, y1 = q.popleft()
        for i in range(4):
            nx = x1 + dx[i]
            ny = y1 + dy[i]
            if 0<= nx < N and 0<= ny < M:
                if graph[nx][ny] == 1:
                    q.append((nx,ny))
                    graph[nx][ny] = 9


T = int(input())
# M은 가로길이 N은 세로길이 K는 배추가 심어져 있는 위치의 개수
M, N, K = map(int,input().split())
graph = [[0] * M for _ in range(N)]


for _ in range(T):
    for _ in range(K):
        answer = 0
        a, b = map(int,input().split())
        graph[b][a] = 1

    for i in range(N):
        for j in range(M):
            if graph[i][j] == 1:
                bfs(graph,i,j)
                answer += 1
    print(answer)
