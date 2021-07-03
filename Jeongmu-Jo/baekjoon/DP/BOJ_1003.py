fibo_zero = [1, 0, 1]
fibo_one = [0, 1, 1]

def dp(n):
    if len(fibo_zero) <= n:
        for i in range(len(fibo_zero), n+1):
            fibo_zero.append(fibo_zero[i-1] + fibo_zero[i-2])
            fibo_one.append(fibo_one[i-1] + fibo_one[i-2])
    print(fibo_zero[n], fibo_one[n])

for _ in range(int(input())):
    N = int(input())
    dp(N)
# 점화식 : DP[N] = DP[N-1] + DP[N-2]
#feat(Jeongmu-Jo): [BOJ, 1003] 피보나치 함수
