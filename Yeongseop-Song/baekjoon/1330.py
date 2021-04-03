# boj 1330 두 수 비교하기 b4
# noj.am/1330

A, B = map(int, input().split())


def compare(x, y):
    if x > y:
        return ">"
    elif x < y:
        return "<"
    else:
        return "=="


print(compare(A, B))
