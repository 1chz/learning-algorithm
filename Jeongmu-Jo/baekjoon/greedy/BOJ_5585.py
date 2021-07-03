payment = int(input())
charge = 1000 - payment
money_list = [500, 100, 50, 10, 5, 1]
count = 0
index = 0


while True:
    if charge == 0:
        break
    if(charge - money_list[index]) < 0:
        index += 1
    else:
        charge = charge - money_list[index]
        count += 1
print(count)



# 거스름돈 가장 적게
# 1000 - input을 가장 적게 나오는 잔돈
# 60 940  500, 100, 100, 100, 100, 50 X, 10 x 4


#[브~골] 탐욕법(Greedy) 48제 #2
#feat(Jeongmu-Jo): [BOJ, 5585] 거스름돈