import sys

sys.stdin = open('input.txt', 'r')

N, C = map(int, input().split())

# 가장 가까운 두 말의 최대 거리

x_lists = []
for i in range(N):
    x_lists.append(int(input()))
# 1 2 4 8 9

# 1 3 5 6 7 8 9 10
x_lists.sort()

lt = x_lists[0]
rt = x_lists[-1]
mid = 0
while lt <= rt:
    mid = (lt + rt) // 2
    stack = []
    stack.append(x_lists[0])
    count = 0
    for i in range(1, N):
        if count == C:
            lt = mid + 1
            stack = []
            break
        elif x_lists[i] - stack[0] >= mid:
            stack.append(x_lists[i])
            print(stack.pop(0))
    else:
        if count < C:
            rt = mid -1
            stack = []
            break
print(mid)