# https://www.acmicpc.net/problem/19944

n,m=map(int,input().split())
if m==1 or m==2:
    print("NEWBIE!")
elif n<m: print("TLE!")
else : print("OLDBIE!")