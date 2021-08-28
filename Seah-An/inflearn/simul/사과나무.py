import sys

#sys.stdin = open('input.txt', 'rt')

n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]

middle = n // 2

sum_of_apple = 0
# 1,3,5,3,1 이런식으로 줄어들음
sum_of_apple += sum(arr[middle])
for i in range(middle):
    sum_of_apple += sum(arr[i][middle - i:middle + i+1])
num = 0
for i in range(n - 1, middle, -1):
    sum_of_apple += sum(arr[i][middle - num:middle + num + 1])
    num += 1
print(sum_of_apple)