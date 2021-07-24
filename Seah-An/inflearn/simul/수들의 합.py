import sys

# sys.stdin = open('input.txt', 'r')

N, M = map(int, input().split())

lists = list(map(int, input().split()))

# lp => 왼쪽으로부터 하나씩 움직임-> i
# rp => 오른쪽으로부터 하나씩 움직임 -> j
count = 0
for i in range(len(lists)):
    sum = 0
    sum += lists[i]
    if sum == M:
        count += 1
        continue
    for j in range(i + 1, len(lists)):
        sum += lists[j]
        if sum == M:
            count += 1
            break
        elif sum > M:
            break
print(count)
