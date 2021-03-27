# 카드 게임
n, m, k = map(int, input().split())
print(min(m, k) + min(n - m, n - k))