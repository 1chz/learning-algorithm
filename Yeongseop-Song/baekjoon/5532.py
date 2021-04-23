# boj 5532 방학 숙제 b4
# noj.am/5532
import math

L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

koreanHomeWork = math.ceil(A / C)
mathHomeWork = math.ceil(B / D)
homeWorkDay = koreanHomeWork if koreanHomeWork > mathHomeWork else mathHomeWork
res = L - homeWorkDay
print(res)
