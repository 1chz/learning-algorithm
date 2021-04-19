# https://www.acmicpc.net/problem/11943

a,b = map(int, input().split())
c,d = map(int, input().split())

print(min(a+d, c+b))
