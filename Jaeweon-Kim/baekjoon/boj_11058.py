# 크리보드
n = int(input())
dp = [i for i in range(n+1)]
if n <= 6:
    print(dp[n])
else:
    for i in range(7, n+1):
        dp[i] = max(dp[i-3] * 2, max(dp[i-4] * 3, dp[i-5] * 4))
    print(dp[n])