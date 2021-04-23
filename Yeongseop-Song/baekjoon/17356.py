# boj 17356 욱 제 b3
# noj.am/17356

uk, je = map(int, input().split())
M = (je - uk) / 400
res = 1 / (1 + 10 ** M)
print(res)
