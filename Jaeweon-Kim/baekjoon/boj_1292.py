# 쉽게푸는문제
a, b = map(int, input().split())
sequence = []
for i in range(1, 46):
    sequence += [i] * i
print(sum(sequence[a-1:b]))