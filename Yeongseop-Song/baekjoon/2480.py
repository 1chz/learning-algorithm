# boj 2480 주사위 세개 b4
# noj.am/2480

x = list(map(int, input().split()))
count = []
count.append(x.count(x[0]))
count.append(x.count(x[1]))
count.append(x.count(x[2]))
maxValue = max(count)
if maxValue == 3:
    print(10000 + x[count.index(maxValue)] * 1000)
elif maxValue == 2:
    print(1000 + x[count.index(maxValue)] * 100)
else:
    print(max(x)*100)
