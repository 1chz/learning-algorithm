# 헛간 청약
n, w, h, l = map(int, input().split())
max = (w//l) * (h//l)
if(max >= n):
    print(n)
else:
    print(max)