# 킹, 퀸, 룩, 비숍, 나이트, 폰
a = [1, 1, 2, 2, 2, 8]
b = list(map(int, input().split()))
for i in range(6):
    print(a[i] - b[i], end=' ')