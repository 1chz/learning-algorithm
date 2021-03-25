# 수찬은 마린보이야!!
n = int(input())

if(n == 0):
    print("divide by zero")
else:
    score = list(map(int, input().split()))
    avg = sum(score) / n
    ex = 0
    for score in score:
        ex += score * (1 / n)
    print("%.2f" % round(avg / ex, 2))