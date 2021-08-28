import sys

input = sys.stdin.readline

N = int(input())
good = 0
for _ in range(N):
    sent = input().rstrip()
    stack = []

    for word in sent:
        if len(stack) != 0 and stack[-1] == word:
            stack.pop()
        else:
            stack.append(word)
    if stack==[]:
        good += 1
print(good)
