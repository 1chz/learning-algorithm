import sys

sys.stdin = open('input.txt', 'r')

arr = [list(map(int, input().split())) for _ in range(9)]

lists = [i for i in range(1, 10)]
result = 'YES'
# 가로
for i in range(9):
    row_arr = sorted(arr[i])
    for j in range(9):
        if row_arr[j] != lists[j]:
            result = 'NO'

for i in range(9):
    column_arr = []
    for j in range(9):
        column_arr.append(arr[j][i])
        column_arr.sort()
    for k in range(9):
        if column_arr[k] != lists[j]:
            result = 'NO'

for i in range(3):
    for j in range(3):
        box_arr = []
        for k in range(3):
            for l in range(3):
                box_arr.append(arr[i * 3 + k][j * 3 + l])
                box_arr.sort()

print(result)
