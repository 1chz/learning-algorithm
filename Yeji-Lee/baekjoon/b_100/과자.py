# https://www.acmicpc.net/problem/10156

K, N, M = list(map(int, input().split()))
print(((K*N)-M) if ((K*N)-M) >= 0 else 0)

