# 나이 계산하기
y1, m1, d1 = map(int, input().split())
y2, m2, d2 = map(int, input().split())

# 만 나이
if(m1 * 100 + d1 <= m2 * 100 + d2):
    print(y2 - y1)
else:
    print(y2 - y1 - 1)
# 세는 나이
print(y2 - y1 + 1)
# 연 나이
print(y2 - y1)