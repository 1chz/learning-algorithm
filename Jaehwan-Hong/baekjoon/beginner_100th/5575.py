# 타임 카드
for _ in range(3):
    h1, m1, s1, h2, m2, s2 = map(int, input().split())
    t1 = h1 * 60 * 60 + m1 * 60 + s1
    t2 = h2 * 60 * 60 + m2 * 60 + s2
    result = t2 - t1
    h3 = result // (60 * 60)
    m3 = result // 60 % 60
    s3 = result % 60
    print(h3, m3, s3)