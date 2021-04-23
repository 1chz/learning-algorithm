# boj 17256 달달함이 넘쳐흘러 b5
# noj.am/17256

_list = [list(map(int, input().split())) for _ in range(2)]
ans = [_list[1][0] - _list[0][2], _list[1][1] //
       _list[0][1], _list[1][2] - _list[0][0]]
print(*ans)
