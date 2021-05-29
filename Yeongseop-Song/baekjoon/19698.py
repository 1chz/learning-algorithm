# boj 19698 헛간 청약 b4
# noj.am/19698

N, W, H, L = map(int, input().split())
res = (W // L) * (H // L)
print(res) if res <= N else print(N)
