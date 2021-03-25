# boj 15964 이상한 기호 b5
# noj.am/15964

print((lambda x, y: (x + y) * (x - y))(*map(int, input().split())))
