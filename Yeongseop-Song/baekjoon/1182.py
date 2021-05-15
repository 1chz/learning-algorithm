# boj 1182 부분수열의 합 s2
# noj.am/1182

N, S = map(int, input().split())
_int = list(map(int, input().split()))
cnt = 0


def recursive(idx, sum):
    global cnt
    if idx >= N:
        return

    sum += _int[idx]
    if sum == S:
        cnt += 1

    recursive(idx + 1, sum - _int[idx])
    recursive(idx + 1, sum)


recursive(0, 0)
print(cnt)
