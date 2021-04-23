import sys


t = int(sys.stdin.readline())
for i in range(t):

    N1 = int(sys.stdin.readline())
    s = [0 for i in range(N1 + 1)]
    for j in range(N1):
        a, b = map(int, sys.stdin.readline().split())
        s[a] = b
    min_n = s[1]
    cnt = 0
    for k in range(2, N1 + 1):
        if s[k] > min_n:
            cnt += 1
        else:
            min_n = s[k]
    print(N1 - cnt)

#
# import sys
#
# t= int(input())
#
# for _ in range(t):
#     n=int(input())
#     lst=sorted([list(map(int,sys.stdin.readline().strip().split())) for x in range(n)],key= lambda x:x[0])
#
#     print(lst)

