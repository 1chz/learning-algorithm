import sys

#sys.stdin = open("input.txt", "r")

N = int(input())
arr = list(map(int, input().split()))
num_list = []

def digit_sum(x):
    sum_num = 0
    x = str(x)
    for i in range(len(x)):
        sum_num += int(x[i])
    return sum_num

for i in range(len(arr)):
    num_list.append(digit_sum(arr[i]))

max_num = float('-inf')
key = -1
for key, value in enumerate(num_list):
    if max_num < value:
        max_num = value
        max_key = key

print(arr[max_key])