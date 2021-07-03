N = int(input())
money = sorted(list(map(int, input().split())))
M = int(input())

# 모든 요청 (money list 다 더한것) 가능하면 그대로
# 아니면 상한액을 잡음 ex 127 / 120 110 127 127
# if money[i] < 상한액: 예산 += money[i]


if sum(money) <= M:
    print(money[-1])
    exit()

start = 0
end = money[-1]
ans = 0
while start <= end:
    mid = (start + end) // 2
    total_budget = 0
    for i in money:
        total_budget += min(mid, i)
    if total_budget <= M:
        start = mid + 1
        ans = mid
    else:
        end = mid -1
print(ans)
#feat(Jeongmu-Jo): [BOJ, 2512] 예산
