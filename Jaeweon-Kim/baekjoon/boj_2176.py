# 합리적인 이동경로
from heapq import heappush, heappop

def go(a):
    if dp[a] != -1:
        return dp[a]
    if a == 2:
        return 1
    dp[a] = 0
    for nval, nxt in board[a]:
        if dist[a] > dist[nxt]:
            dp[a] += go(nxt)
    return dp[a]

S, T = 1, 2
N, M = map(int, input().split())
board=[[] for _ in range(N+1)]
for _ in range(M):
    a,b,c = map(int, input().split())
    board[a].append([c, b])
    board[b].append([c, a])

# 도착 점(T=2)으로 부터 출발 점까지의 최단 거리를 계산하여 dist 배열에 저장
dist = [1e9] * (N+1)
dist[2] = 0
q = []
heappush(q, (0, T))
while q:
    val, cur = heappop(q)
    for nval, nxt in board[cur]:
        nval += val
        if dist[nxt] > nval:
            dist[nxt] = nval
            heappush(q, (nval, nxt))

# 출발 점(S=1)으로 부터 도착 점까지의 거리를 다이나믹으로 계산
dp = [-1] * (N+1)
print(go(1))

