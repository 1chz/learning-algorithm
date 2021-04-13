# 동전 2
n, k = map(int, input().split())
coins = [int(input()) for _ in range(n)]
INF = int(1e9)
dp = [INF] * (k+1)
dp[0] = 0

for i in coins:
    for j in range(i, k+1):
        dp[j] = min(dp[j], dp[j-i] + 1)
        # print(dp)

dp[k] = dp[k] if dp[k] != INF else -1
print(dp[k])