# 숨바꼭질 3

from collections import deque

def bfs():
    q = deque()
    q.append(N)
    while q:
        x = q.popleft()
        if x == K:
            return road[x]
        for i in (x+1, x-1, x*2):
            if 0 <= i < 100001 and not road[i]:
                if i == x*2 and i != 0:
                    road[i] = road[x]
                    q.appendleft(i)
                else:
                    road[i] += road[x] + 1
                    q.append(i)

N, K = map(int, input().split())
road = [0] * 100001 # [방문 및 시간, 방법]

print(bfs())