# 체스판 조각
n = int(input())
if(n % 2 == 1):
    print((n // 2 + 1) * (n // 2 + 2))
else:
    print((n // 2 + 1) ** 2)