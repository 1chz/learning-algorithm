# boj 16655 N과 M (7) s3
# noj.am/15656

N, M = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()


def recursive(res):
    if len(res) == M:
        print(*res)
        return
    for i in _list:
        res.append(i)
        recursive(res)
        res.pop()


recursive([])


# 중복순열 라이브러리 풀이
'''
import itertools

N, M = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()
res = itertools.product(_list, repeat=M)
for i in res:
    print(*i)
'''
