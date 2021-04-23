# boj 5575 타임 카드 b4
# noj.am/5575

A = list(map(int, input().split()))
B = list(map(int, input().split()))
C = list(map(int, input().split()))


def workTime(_list):
    h = 0
    m = 0
    s = 0

    s = _list[5] - _list[2]
    m = _list[4] - _list[1]
    h = _list[3] - _list[0]
    if s < 0:
        s = s + 60
        if m == 0:
            m = 59
            h -= 1
        else:
            m -= 1
    if m < 0:
        m += 60
        h -= 1
    return f"{h} {m} {s}"


print(workTime(A))
print(workTime(B))
print(workTime(C))
