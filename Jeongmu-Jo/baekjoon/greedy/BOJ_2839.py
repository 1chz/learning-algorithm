import math

N = int(input())
# 설탕을 모두 5
five_bag = N//5
other_bag = N - (five_bag * 5)

if(N % 5) == 0:
    print(int(N//5))
elif other_bag%3 == 0:
    print(int(five_bag + other_bag//3))
else:
    while True:
        if five_bag < 0:
            print(-1)
            break
        elif other_bag%3 == 0:
            print(int(five_bag + other_bag//3))
            break
        five_bag -= 1
        other_bag = N - (five_bag * 5)


#[브~골] 탐욕법(Greedy) 48제 #1
#feat(Jeongmu-Jo): [BOJ, 2839] 설탕 배달