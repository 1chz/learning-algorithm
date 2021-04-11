import sys

t=int(sys.stdin.readline())


for i in range(t):
    n=int(sys.stdin.readline())
    wd=[]
    flag=0
    for j in range(n):
        wd.append(str(sys.stdin.readline().replace('\n','')))


    wd.sort()


    for i in range(len(wd)-1):
        if wd[i] == wd[i+1][0:len(wd[i])]:
            print('NO')
            flag=1
            break
    if flag==0:
        print('YES')

