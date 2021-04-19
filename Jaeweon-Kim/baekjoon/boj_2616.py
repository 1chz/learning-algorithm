# 소형기관차
n = int(input())
trains = list(map(int, input().split()))
m = int(input()) # 객차 1대가 한번에 끌고 갈 수 있는 수


train_sum = [0]*(n+1)
tot = 0
for i in range(1, n+1):
    train_sum[i] = trains[i-1] + tot
    tot += trains[i-1]

dp = [[0]*(n+1) for _ in range(4)]

for i in range(1, 4):
    for j in range(i*m, n+1):
        dp[i][j] = max(
            dp[i][j-1],
            dp[i-1][j-m] + train_sum[j]-train_sum[j-m])
print(dp[3][n])
