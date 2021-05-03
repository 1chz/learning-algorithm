import sys

N=int(sys.stdin.readline())

arr=[]

for i in range(N):
    arr.append(list(sys.stdin.readline()))

check=0
countx=0
county=0


for i in range(N):
    for j in range(N):
        if arr[i][j]=='X':
            check=0
            continue
        elif check==0 and j+1<N and arr[i][j+1]=='.':
            check=1
            countx+=1
    check=0

check=0

for i in range(N):
    for j in range(N):
        if arr[j][i]=='X':
            check=0
            continue
        elif check==0 and j+1<N and arr[j+1][i]=='.':
            check=1
            county+=1
    check=0


print(countx,county)