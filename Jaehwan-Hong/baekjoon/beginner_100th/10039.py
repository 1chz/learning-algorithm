# 평균 점수
sum = 0
for i in range(5):
    n = int(input())
    if(n < 40):
        n = 40
    sum += n
print(sum // 5)