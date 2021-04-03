import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    case = input()
    stack = 0
    for i in range(len(case)):
        if case[i] == "(":
            stack += 1
        elif case[i] == ")":
            stack -= 1
        if stack < 0:
            print('NO')
            break

    if stack > 0:
        print('NO')
    elif stack ==0:
        print('YES')