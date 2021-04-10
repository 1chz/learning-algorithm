# boj 10156 과자 b4
# noj.am/10156

K, N, M = map(int, input().split())
res = K * N
print(res - M) if res > M else print(0)
