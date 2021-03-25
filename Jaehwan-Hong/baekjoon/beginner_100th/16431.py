# 베시와 데이지
b1, b2 = map(int, input().split())
d1, d2 = map(int, input().split())
j1, j2 = map(int, input().split())

# 베시의 이동거리
b = max(abs(j1 - b1), abs(j2 - b2))
# 데이지의 이동거리
d = abs(j1 - d1) + abs(j2 - d2)

if(b < d):
    print("bessie")
elif(b > d):
    print("daisy")
else:
    print("tie")