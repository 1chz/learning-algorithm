# boj 10569 다면체 b3
# noj.am/10569

T = int(input())
_list = [list(map(int, input().split())) for _ in range(T)]

for V, E in _list:
    print(2 - V + E)
