import sys

input = sys.stdin.readline

N = int(input())

lists = list(map(int, input().split()))
max_num = [0] * N
answer = -1000

for i in range(len(lists)):
    max_num[i] = max(lists[i]+max_num[i-1], lists[i])
    answer = max(answer,max_num[i])

print(answer)