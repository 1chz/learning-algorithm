# 주사위 게임
chang = sang = 100
n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    if a > b: sang -= a
    elif a < b: chang -= b
print(chang, sang, sep='\n')