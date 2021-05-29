N = int(input())
ans = 0

def winner(lst):
    money = 0
    if len(set(lst)) == 1:
        money += 50000 + lst[0]*5000
    elif len(set(lst)) == 2:
        if lst[1] == lst[2]:
            money += 10000 + lst[1]*1000
        else :
            money += 2000 + lst[1]*500 + lst[2]*500
    elif len(set(lst)) == 3:
        for i in range(3):
            if lst[i] == lst[i+1]:
                money += 1000 + 100*lst[i]
        # 4개 중 같은 눈이 2개인 것 찾을 떄 사용
    else:
        money += lst[-1]*100
    return money

# 3 3 3 2 / 4 3 3 3  
# 33 22 / 33 44 
# 3 2 2 1 / 3 2 1 1 / 3 3 2 1

for _ in range(N):
    lst = sorted(list(map(int, input().split())))
    ans = max(ans, winner(lst))

print(ans)
#feat(Jeongmu-Jo): [BOJ, 2484] 주사위 네개