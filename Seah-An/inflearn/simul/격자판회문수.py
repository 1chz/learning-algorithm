import sys

# sys.stdin = open('input.txt','r')

arr = [list(map(int,input().split())) for _ in range(7)]

count = 0

for i in range(7):
    for j in range(3):
        row_lists = arr[i][j:j+5]
        for k in range(2):
            if row_lists[k] != row_lists[4-k]:
                break
        else:
            count += 1
for i in range(7):
    for j in range(3):
        column_lists = []
        for l in range(5):
            column_lists.append(arr[j+l][i])
        for k in range(2):
            if column_lists[k] != column_lists[4-k]:
                break
        else:
            count += 1

print(count)