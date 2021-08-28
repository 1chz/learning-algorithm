import sys

#sys.stdin = open('input.txt', 'r')

n = int(input())

arr = [[0] * (n + 2) for _ in range(n+2)]

matrix = [list(map(int, input().split())) for _ in range(n)]

count = 0
for i in range(1, n + 1):
    for j in range(1, n + 1):
        arr[i][j] = matrix[i-1][j-1]

for i in range(1,n+1):
    for j in range(1,n+1):
        if arr[i][j] > arr[i-1][j] and arr[i][j] > arr[i][j-1] and arr[i][j] > arr[i][j+1] and arr[i][j] > arr[i+1][j]:
            count += 1
print(count)