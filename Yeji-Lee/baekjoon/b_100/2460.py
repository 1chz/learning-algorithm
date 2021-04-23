# 지능형 기차 2
t = []
sum = 0
for i in range(10):
    a, b = map(int, input().split())
    sum += b - a
    t.append(sum)
print(max(t))