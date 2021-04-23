# boj 14729 칠무해 s5
# noj.am/14729

import sys

g = [float(sys.stdin.readline().rstrip()) for _ in range(int(input()))]
g.sort()
for i in range(7):
    print("%.3f" % (g[i]))
