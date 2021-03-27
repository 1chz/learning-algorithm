# 수도요금
a = int(input()) # x사의 리터당 요금
b = int(input()) # y사의 기본요금
c = int(input()) # y사의 기본요금의 상한 사용량
d = int(input()) # y사의 리터당 추가요금
p = int(input()) # 한달간 수도량

p1 = a * p

if(p > c):
    p2 = b + (p - c) * d
else:
    p2 = b
print(max(p1, p2))