# 큰 수 곱셈
from decimal import Decimal, getcontext
getcontext().prec = 10 ** 6
a, b = input().split()
print(Decimal(a) * Decimal(b))