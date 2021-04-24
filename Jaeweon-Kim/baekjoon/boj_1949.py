# 우수 마을
import sys
input = sys.stdin.readline
sys.setrecursionlimit(20000)
def dfs(current):
    check[current] = True
    dp[current][0] = population[current]
    for nxt in board[current]:
        if not check[nxt]:
            dfs(nxt)
            dp[current][0] += dp[nxt][1]
            dp[current][1] += max(dp[nxt][0], dp[nxt][1])                

N = int(input())
population = list(map(int, input().split()))
population.insert(0, 0)
board = [[] for _ in range(N+1)]
for _ in range(N-1):
    a,b = map(int, input().split())
    board[a].append(b)
    board[b].append(a)

# dp[i][0]은 i정점을 포함했을때의 최댓값, dp[i][1]은 i정점을 포함하지 않았을때의 최댓값
dp = [[0, 0] for _ in range(N+1)]
check = [False] * (N+1)
dfs(1)
print(max(dp[1][0], dp[1][1]))