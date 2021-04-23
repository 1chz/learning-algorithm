# 페르시아의 왕들
while True:
    a, b, c, d = map(int, input().split())
    if a == b == c == d == 0:
        break
    minAge = min(c, d) - max(a, b)
    maxAge = max(c, d) - min(a, b)
    print(minAge, maxAge)