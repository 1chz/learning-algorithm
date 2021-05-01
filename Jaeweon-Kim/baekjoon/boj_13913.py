# 숨바꼭질 4

from collections import deque

def path(x):
    arr = []
    temp = x
    for _ in range(roads[x] + 1):
        arr.append(temp)
        temp = moves[temp]
    print(' '.join(map(str, arr[::-1])))


def bfs():
    q = deque()
    q.append(n)
    while q:
        x = q.popleft()
        if x == k:
            print(roads[x])
            path(x)
            return
        for nx in (x+1, x-1, x*2):
            if 0 <= nx < 100001 and roads[nx] == 0:
                roads[nx] = roads[x] + 1
                moves[nx] = x
                q.append(nx)
                
n, k = map(int, input().split())
roads = [0] * 100001
moves = [0] * 100001
bfs()