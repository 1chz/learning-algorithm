# 숨바꼭질 2

from collections import deque

def bfs(N):
    q = deque()
    q.append(N)
    road[N][0] = 0
    road[N][1] = 1
    while q:
        x = q.popleft()
        for i in (x+1, x-1, x*2):
            if 0 <= i < 100001:
                if road[i][0] == -1: # 최초 방문
                    road[i][0] = road[x][0] + 1
                    road[i][1] = road[x][1]
                    q.append(i)
                
                elif road[i][0] == road[x][0] + 1: # 최초 시간으로 한번 이상 방문시
                    road[i][1] += road[x][1]


N, K = map(int, input().split())
road = [[-1, 0] for _ in range(1000001)] # [방문 및 시간, 방법]

bfs(N)
print(road[K][0])
print(road[K][1])