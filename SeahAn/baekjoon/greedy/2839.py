import sys

input = sys.stdin.readline

N = int(input())

cnt = 0

while N >= 0:

    if N % 5 == 0:
        cnt += (N // 5)
        print(cnt)
        break
    N -= 3
    cnt += 1
else:
    print(-1)

