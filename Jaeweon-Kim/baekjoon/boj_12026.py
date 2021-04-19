# boj 거리
n = int(input())
li = input()
INF = int(1e9)
dp = [INF] * n

def get_prev(x):
    if x == 'B':
        return 'J'
    elif x == 'O':
        return 'B'
    else:
        return 'O'

dp[0] = 0
for i in range(1, n):
    prev = get_prev(li[i])
    for j in range(i):
        if li[j] == prev:
            dp[i] = min(dp[i], dp[j] + pow(i - j, 2))
print(dp[n-1] if dp[n-1] != INF else -1)