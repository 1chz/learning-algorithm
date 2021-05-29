# boj 15655 N과 M (6) s3
# noj.am/15655

N, M = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()  # 오름차순이여야 하므로


def recursive(res):
    if len(res) == M:
        print(*res)

    for i in _list:  # 리스트에 있는 원소들을 돌면서
        if len(res) == 0 or res[-1] < i:  # 뒤에 나오는 값은 앞보다 커야된다
            res.append(i)
            recursive(res)
            res.pop()  # 백트래킹


recursive([])

'''
# 조합풀이
import itertools

N, M = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()
res = itertools.combinations(_list, M)
for i in res:
    print(*i)
'''
