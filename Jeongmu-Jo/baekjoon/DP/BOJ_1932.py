N = int(input())
A = [[0 for i in range(N+1)] for _ in range(N+1)]
# DP[i][j] : i, j 도착했을 때 최대값
# DP[i][j] : max(DP[i-1][j-1], DP[i-1][j]) + A[i][j]
DP = [[0 for i in range(N+1)] for _ in range(N+1)]

for i in range(1,N+1):
    tmp = list(map(int, input().split()))
    for j in range(1,i+1):
        A[i][j] = tmp[j-1]

for i in range(1, N+1):
    for j in range(1, i+1):
        DP[i][j] = max(DP[i-1][j-1], DP[i-1][j]) + A[i][j]

#for i in A:
    #print(i)

#print("---------------------")

#for i in DP:
    #print(i)

print(max(DP[-1]))
#feat(Jeongmu-Jo): [BOJ, 1932] 정수삼각형