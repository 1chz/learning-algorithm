# 인공지능 시계
a, b, c = map(int, input().split())
d = int(input())
t = a * 60 * 60 + b * 60 + c + d
h = t // (60 * 60) % 24 # 23:59:59가 넘어가면 00:00:00으로 초기화
m = t // 60 % 60
s = t % 60
print(h, m, s)
