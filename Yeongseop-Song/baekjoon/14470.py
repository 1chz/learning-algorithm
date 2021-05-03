# boj 14470 전자레인지 b4
# noj.am/14470

A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())
res = 0

while A < 0:
    A += 1
    res += C

if A == 0:
    res += D

res = res + (B - A) * E

print(res)
