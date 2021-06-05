# https://www.acmicpc.net/problem/1297

d,h,w = map(int,input().split())
r = d/((h ** 2 + w ** 2) ** 0.5)
print(int(h * r),int(w * r))