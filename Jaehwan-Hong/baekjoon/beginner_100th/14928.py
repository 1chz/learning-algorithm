# 큰 수 (BIG)
from decimal import Decimal, getcontext
getcontext().prec = 10 ** 6
n = input()
print(Decimal(n) % 20000303)