# L : 역량, L보다 낮은 것만 가능, 최대 가능 문제 K
# 쉬운 : 100점, 어려운 : 140점

N, L, K = map(int, input().split())

easy, hard = 0, 0

for i in range(N):
    sub1, sub2 = map(int, input().split())
    if sub2 <= L:
        hard += 1
    elif sub1 <= L:
        easy += 1

ans = min(hard, K) * 140
# 경우 1 : hard = 4, K = 3이면 풀수있는 어려운문제 3, K = 3이므로 3문제 
# 경우 2 : hard = 2, K = 4이면 풀수있는 hard 2, K = 4이므로 2문제 더 가능
# 2문제 -> K-hard
# 경우 3 : 경우 2에서 easy가 0 인 경우 남은 두 문제 모두 풀 수 없으므로 0
# 경우 4 : 경우 2에서 easy가 2인 경우 남은 두문제 모두 풀 수 있으므로 200점
# min(K-hard, easy)는 남은 시간과 풀 수 있는 easy문제
# K-hard가 easy보다 작은 경우는 풀수 있는 easy는 더 많지만 시간이 부족
# easy가 K-hard보다 작은 경우는 시간은 있지만 풀수 없는 easy개수

if hard < K:
    ans += min(K-hard, easy) * 100

print(ans)
#feat(Jeongmu-Jo): [BOJ, 17224] APC는 왜 서브태스크 대회가 되었을까?