# 퇴사

N = int(input())
T, P = [], []
dp = [0] * (N + 1)
max_value = 0
for _ in range(N):
    a, b = map(int ,input().split())
    T.append(a)
    P.append(b)

for i in range(N-1, -1, -1):
    time = T[i] + i
    if time <= N:
        dp[i] = max(P[i] + dp[time], max_value)
        max_value = dp[i]
    else:
        dp[i] = max_value

print(max_value)