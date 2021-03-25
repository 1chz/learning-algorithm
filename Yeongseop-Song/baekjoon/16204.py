# boj 16204 카드 뽑기 b4
# noj.am/16204

N, M, K = map(int, input().split())
F_O = M
F_X = N - M
B_O = K
B_X = N - K


def sol(x, y):
    return y if x >= y else x


res = sol(F_O, B_O) + sol(F_X, B_X)
print(res)
