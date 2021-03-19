# boj 8393 합 b5
# noj.am/8393

print(sum([i for i in range(1, int(input()) + 1)]))

''' 재귀연습 겸 하지만 max depth error
def recursive(N):
    if N == 1:
        return 1
    return recursive(N - 1) + N


print(recursive(int(input())))
'''
