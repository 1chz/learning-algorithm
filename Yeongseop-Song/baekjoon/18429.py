# boj 18429 근손실 s3
# noj.am/18429

import itertools

N, K = map(int, input().split())
_list = list(map(int, input().split()))
ans = itertools.permutations(_list, N)  # 가능한 순열
cnt = 0

for i in ans:
    res = 0
    for j in range(N):  # 가능한 순열을 돌면서 음수가 되는 것들은 pass
        res = res + i[j] - K
        if res < 0:
            break
    if res >= 0:
        cnt += 1

print(cnt)
