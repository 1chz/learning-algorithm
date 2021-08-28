import sys

# sys.stdin = open('input.txt', 'r')

N = int(input())

'''
1. 행의 합 [x,x,x,x,x] 중 가장 큰거
2. 열의 합 [x,x,x,x,x] 중 가장 큰거
3. 왼쪽 대각선의 합
4. 오른쪽 대각선의 합

이 4개 비교해서 가장 큰 거
'''
arr = []

sum_of_row = 0
lists_of_column = []
sum_of_column = 0
sum_of_left_diagonal = 0
sum_of_right_diagonal = 0

# 배열 입력받기 + sum_of_row
for i in range(N):
    lists = list(map(int, input().split()))
    if sum_of_row < sum(lists):
        sum_of_row = sum(lists)
    arr.append(lists)

# sum_of_column
for i in range(N):
    sum_of_column = 0
    for j in range(N):
        sum_of_column += arr[j][i]
    else:
        lists_of_column.append(sum_of_column)

# 두 대각선의 합

for i in range(N):
    sum_of_left_diagonal += arr[i][i]

for i in range(N):
    sum_of_right_diagonal += arr[i][N - 1 - i]

print(max(sum_of_row, sum_of_column, sum_of_right_diagonal, sum_of_left_diagonal))
