# boj 10707 수도요금 b4
# noj.am/10707

A = int(input())
B = int(input())
C = int(input())
D = int(input())
P = int(input())

print(min(A * P, B + D * (0 if (P - C) < 0 else (P - C))))
