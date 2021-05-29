import sys

input = sys.stdin.readline

iron = input().rstrip()

sum = 0
pipe = 0
for i in range(len(iron)):
    if iron[i] == '(':
        pipe += 1
    elif iron[i] == ')':
        pipe -= 1
        if iron[i-1] == '(':
            sum = sum + pipe
        else:
            sum = sum + 1
print(sum)
