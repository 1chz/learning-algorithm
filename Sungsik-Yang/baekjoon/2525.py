time = list(map(int, input().strip().split(" ")))
min_added = int(input())
time[0] += (min_added // 60)
time[1] += (min_added % 60)

if time[1] >= 60:
    time[0] += 1
    time[1] -= 60
if time[0] >= 24:
    time[0] -= 24
print(time[0], time[1])