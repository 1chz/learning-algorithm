# boj 3003 킹, 퀸, 룩, 비숍, 나이트, 폰 b5
# noj.am/3003

# pypy3 최단시간 풀이
chess = list(map(int, input().split()))
_list = [1, 1, 2, 2, 2, 8]
ans = []
for i in range(len(_list) - 1, -1, -1):
    ans.append(_list[i] - chess.pop())
print(*reversed(ans))
