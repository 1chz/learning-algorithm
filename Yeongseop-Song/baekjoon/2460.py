# boj 2460 지능형 기차 2 b3
# noj.am/2460

numOfPeople = [map(int, input().split()) for _ in range(10)]
people = 0
res = 0

for getoff, geton in numOfPeople:
    people += geton - getoff
    res = max(res, people)

print(res)
