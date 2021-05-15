# boj 10828 스택 s4
# noj.am/10828

import sys

input = sys.stdin.readline
_stack = []
for _ in range(int(input())):
    command = input().rstrip().split()
    if command[0] == "push":
        _stack.append(command[1])
        continue
    elif command[0] == "pop":
        if _stack:
            print(_stack.pop())
        else:
            print(-1)
        continue
    elif command[0] == "size":
        print(len(_stack))
        continue
    elif command[0] == "empty":
        if _stack:
            print(0)
        else:
            print(1)
        continue
    elif command[0] == "top":
        if _stack:
            print(_stack[-1])
        else:
            print(-1)
        continue
