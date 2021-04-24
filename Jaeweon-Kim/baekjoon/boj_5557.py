# 1학년
n = int(input())
nums = list(map(int, input().split()))
dp = [[0] * (21) for _ in range(n-1)]

dp[0][nums[0]] = 1
for i in range(1, n-1):
    for j in range(21):
        if dp[i - 1][j] != 0:
            prev_value = j
            now_value = nums[i]
            if 0 <= prev_value + now_value <= 20:
                dp[i][prev_value + now_value] += dp[i - 1][prev_value]
            if 0 <= prev_value - now_value <= 20:
                dp[i][prev_value - now_value] += dp[i - 1][prev_value]

print(dp[n-2][nums[-1]])