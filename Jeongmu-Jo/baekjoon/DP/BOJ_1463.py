# DP[i] : 연산을 사용하는 횟수의 최소값( **횟수** )
# DP[i] = min(DP(N//3)+1 )
N = int(input())
DP = [0 for i in range(N+1)]

for i in range(2, N+1):
    DP[i] = DP[i-1]+1

    if i%3 == 0:
        DP[i] = min(DP[i], DP[i//3] + 1)
    elif i%2 == 0:
        DP[i] = min(DP[i], DP[i//2] + 1)
    print('N :', i, 'DP', DP)
# 10 -> 9 -> 3 -> 1 
#feat(Jeongmu-Jo): [BOJ, 1463] 1로 만들기