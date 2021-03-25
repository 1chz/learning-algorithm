# boj 16657 N과 M (8) s3
# noj.am/15657

N, M = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()


def recursive(res):
    if len(res) == M:
        print(*res)
        return

    for i in _list:
        if len(res) == 0 or res[-1] <= i:  # res가 비었거나 앞의 값이 넣을값보다 작거나 같을때만
            res.append(i)
            recursive(res)
            res.pop()


recursive([])
