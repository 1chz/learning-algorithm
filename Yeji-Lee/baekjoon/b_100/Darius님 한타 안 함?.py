# https://www.acmicpc.net/problem/20499

K, D, A = map(int,input().split())
print("hasu" if K+A < D or D == 0 else "gosu")