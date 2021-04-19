# 데스노트
n, m = map(int, input().split())
name = [int(input()) for _ in range(n)]
dp = [[-1] * (1001) for _ in range(1001)]

def solution(idx, length):
    if idx >= n:
        return 0

    if dp[idx][length] != -1:
        return dp[idx][length]
    
    dp[idx][length] = int(1e9)
    dp[idx][length] = (m - length + 1) ** 2 + solution(idx + 1, name[idx] + 1)

    if length + name[idx] <= m:
        dp[idx][length] = min(dp[idx][length], solution(idx + 1, length + name[idx] + 1))
    
    return dp[idx][length]

print(solution(1, name[0] + 1))
