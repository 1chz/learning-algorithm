import sys

# sys.stdin = open("input.txt", "rt")

N = int(input())
arr = list(map(int, input().split()))

avg = round(sum(arr) / len(arr))

Max = float('inf')
real_min = abs(Max - avg)

min_num = 0

for i in range(len(arr)):
    min = arr[i] - avg
    if abs(min) == abs(real_min):
        if min > real_min:
            real_min = min
            min_num = i
    elif abs(min) < abs(real_min):
        real_min = min
        min_num = i
min_num += 1

print(avg, min_num)
