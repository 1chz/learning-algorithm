# TV 크기
c, a, b, = map(int, input().split())
r = c / ((a ** 2 + b ** 2) ** 0.5)
print(int(a * r), int(b * r))