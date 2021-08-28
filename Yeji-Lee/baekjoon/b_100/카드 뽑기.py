# https://www.acmicpc.net/problem/16204

n, m, k = map(int, input().split())
print(min(m, k) + min(n - m, n - k))