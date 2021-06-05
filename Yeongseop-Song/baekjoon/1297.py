# boj 1297 TV 크기 b4
# noj.am/1297
import math

diagonal, h, w = map(int, input().split())
ratio = math.sqrt(diagonal ** 2 / (h ** 2 + w ** 2))
print(int(ratio * h), int(ratio * w), sep=" ")
