# boj 14652 나는 행복합니다~ b5
# noj.am/14652

# 좌석번호 -> 2중 for 문 인덱스랑 같다.
N, M, K = map(int, input().split())
cnt = -1

for i in range(N):
    for j in range(M):
        cnt += 1
        if cnt == K:
            print(i, j)
            break
