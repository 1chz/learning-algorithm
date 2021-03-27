# 검증수
num = list(map(int, input().split()))
sum = 0
for i in range(5):
    sum += num[i] ** 2
print(sum % 10)