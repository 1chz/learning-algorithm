# boj 15654 N과 M (5) s3
# noj.am/15654

N, M = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()  # 오름차순 출력을 위한 정렬


def rescursive(res):
    if len(res) == M:
        print(*res)

    for i in _list:
        if i not in res:
            res.append(i)
            rescursive(res)
            res.pop()


rescursive([])


# 순열 라이브러리사용
'''
import itertools

N, M = map(int, input().split())
_list = list(map(int, input().split()))
res = itertools.permutations(_list, M)
for i in sorted(res):
    print(*i)
'''
