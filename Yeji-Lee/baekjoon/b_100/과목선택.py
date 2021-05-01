# https://www.acmicpc.net/problem/11948

a=int(input())
b=int(input())
c=int(input())
d=int(input())
e=int(input())
f=int(input())
print(max(a+b+c,a+b+d,a+c+d,b+c+d)+max(e,f))