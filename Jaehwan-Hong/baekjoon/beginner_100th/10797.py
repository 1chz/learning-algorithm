# 10부제
date = int(input())
number = list(map(int, input().split()))
count = 0
for i in range(len(number)):
    if(date == number[i]):
        count += 1
print(count)