# boj 5543 상근날드 b4
# noj.am/5543

_list = [int(input()) for _ in range(5)]
burger = min(_list[0:3])
drink = min(_list[3:5])
print(burger + drink - 50)
