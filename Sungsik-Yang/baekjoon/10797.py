num = int(input())
car_num = list(map(int, input().split(" ")))
count = 0
for x in range(len(car_num)):
    if num == car_num[x]:
        count += 1

print(count)