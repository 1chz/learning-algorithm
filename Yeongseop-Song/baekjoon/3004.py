# boj 3004 체스판 조각 b4
# noj.am/3004

N = int(input())

if N == 1:
    print(2)
elif N == 2:
    print(4)
elif N % 2 == 1:
    res = 2
    for i in range(3, N+1, 2):
        res += (i + 1)
    print(res)
else:
    res = 4
    for i in range(4, N+1, 2):
        res += (i + 1)
    print(res)
