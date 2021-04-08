import sys
input = sys.stdin.readline
t = int(input())
for i in range(t):
    n = int(input())
    s = [0 for i in range(n + 1)]
    for j in range(n):
        a, b = map(int, input().split())
        s[a] = b
    min_n = s[1]
    cnt = 0
    for k in range(2, n + 1):
        if s[k] > min_n:
            cnt += 1
        else:
            min_n = s[k]
    print(n - cnt)


import sys

t= int(input())

for _ in range(t):
    n=int(input())
    lst=sorted([list(map(int,sys.stdin.readline().strip().split())) for x in range(n)],key= lambda x:x[0])

    print(lst)

