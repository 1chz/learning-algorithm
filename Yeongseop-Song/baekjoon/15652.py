# boj 15652 N과 M (4) s3
# noj.am/15652

N, M = map(int, input().split())


def recursive(_list):
    if len(_list) == M:
        print(*_list)
        return
    for i in range(1, N + 1):
        if len(_list) == 0 or i >= _list[-1]:  # 리스트에 들어있는 원소보다 크거나 같을 때 넣는다
            _list.append(i)
            recursive(_list)
            _list.pop()  # 백트래킹


recursive([])
