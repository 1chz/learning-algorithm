# boj 10103 주사위 게임 b3
# noj.am/10103

n = int(input())
_list = [map(int, input().split()) for _ in range(n)]
chang = 100
sang = 100

for x, y in _list:
    if x == y:
        continue
    elif x > y:
        sang -= x
    else:
        chang -= y

print(chang)
print(sang)
