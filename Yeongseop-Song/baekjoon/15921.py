# boj 15921 수찬은 마린보이야!! b4
# noj.am/15921

N = int(input())
p = []
if N != 0:
    p = list(map(int, input().split()))
    avg = sum(p) / N
    E = 0
    for val in p:
        E += val * (1 / N)
    res = avg / E
print("%.2f" % (round(res, 2))) if N != 0 else print("divide by zero")
