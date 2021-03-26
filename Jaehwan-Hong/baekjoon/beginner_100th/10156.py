# 과자
k, n, m = map(int, input().split())
p = k * n - m
if(p < 0):
    print(0)
else:
    print(p)