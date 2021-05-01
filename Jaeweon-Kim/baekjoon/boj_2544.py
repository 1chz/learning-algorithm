# 사회망 서비스(sns)

import sys
sys.setrecursionlimit(10**8)
input = sys.stdin.readline

N = int(input())
edges = [[] for _ in range(N+1)]
visited = [True] * (N+1)
for i in range(N-1):
    a, b = map(int, input().split())
    edges[a].append(b)
    edges[b].append(a)

dp = [[0, 0] for _ in range(N+1)]

def dfs(cur):
    visited[cur] = False # 방문체크
    dp[cur][0] = 1 # 현재 노드를 포함할때
    dp[cur][1] = 0 # 현재 노드를 포함하지 않을때
    for i in edges[cur]: # 연결된 노드 탐색
        if visited[i]: # 자식노드라면
            dfs(i)
            dp[cur][0] += dp[i][1] # 현재노드 포함할때
            dp[cur][1] += max(dp[i][0], dp[i][1]) # 현재노드 포함하지 않을때

dfs(1)
print(N - max(dp[1][0], dp[1][1]))