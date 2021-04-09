# boj 2530 인공지능 시계 b4
# noj.am/2530

h, m, s = map(int, input().split())
time = int(input())
res = h * 3600 + m * 60 + s + time
if res > 86399:
    res = res % 86400
    print(*[res // 3600, res % 3600 // 60, res % 3600 % 60], sep=" ")
else:
    print(*[res // 3600, res % 3600 // 60, res % 3600 % 60], sep=" ")
