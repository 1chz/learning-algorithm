import sys

mul = int(input())
sum = 1

for _ in range(mul):
    sum += int(sys.stdin.readline())

print(sum - mul)