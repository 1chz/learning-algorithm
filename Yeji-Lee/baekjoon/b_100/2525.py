# 오븐 시계
a, b = map(int, input().split())
c = int(input())
t = a * 60 * 60 + b * 60 + c * 60
h = t // (60 * 60) % 24
m = t // 60 % 60
print(h, m)