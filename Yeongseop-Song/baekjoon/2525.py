# boj 2525 오븐 시계 b4
# noj.am/2525

h, m = map(int, input().split())
time = int(input())
res = h * 60 + m + time
if res >= 24 * 60:
    res = res % (24 * 60)
    print(*[res // 60, res % 60], sep=" ")
else:
    print(*[res // 60, res % 60], sep=" ")
