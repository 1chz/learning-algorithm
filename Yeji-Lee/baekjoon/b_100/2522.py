# 별 찍기 - 12
n = int(input())
for i in range(1, n + 1):
    print(' ' * (n - i), end='')
    print('*' * i)

for i in range(1, n):
    print(' ' * i, end='')
    print('*' * (n - i))
