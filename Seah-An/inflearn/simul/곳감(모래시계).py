import sys

# sys.stdin = open('input.txt', 'r')

n = int(input())

arr = [list(map(int, input().split())) for i in range(n)]

m = int(input())


for i in range(m):

    row, direction, move = map(int, input().split())
    if direction == 0:
        for j in range(move):
            arr[row-1].append(arr[row - 1].pop(0))

    elif direction == 1:
        list = []
        for j in range(move):
            arr[row-1].insert(0, arr[row - 1].pop())


s = 0
e = n
middle = n // 2
answer = 0
for i in range(n):
    for j in range(s, e):
        answer += arr[i][j]
    if i >= middle:
        e += 1
        s -= 1
    elif i < middle:
        e -= 1
        s += 1
print(answer)