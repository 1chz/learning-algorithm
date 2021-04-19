# 곱셈
a = int(input())
b = int(input())
bl = []
for i in str(b):
    bl.append(i)
bl = list(map(int, bl))

for i in range(3):
    print(a * bl[2 - i])
print(a * b)