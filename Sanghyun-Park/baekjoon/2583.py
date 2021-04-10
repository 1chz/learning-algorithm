import sys
from collections import deque


dq=deque()

M,N,K=map(int,sys.stdin.readline().split())

maze=[[1 for i in range(M)]for i in range(N)]

dx=[1,-1,0,0]
dy=[0,0,1,-1]



for i in range(K):
    x1,y1,x2,y2=map(int,sys.stdin.readline().split())

    for i in range(x1,x2):
        for j in range(y1,y2):
            maze[i][j]=0



count=0
count_arr=[]

for i in range(N): #M==5
    for j in range(M): #N==7
        if maze[i][j] == 1:
            dq.append((i,j))
            count+=1
            while dq: #영역 전부 지우기
                c_x,c_y=dq.pop()
                maze[c_x][c_y]=0
                for k in range(4):
                    x=c_x+dx[k]
                    y=c_y+dy[k]

                    if 0<=x<N and 0<=y<M:
                        if maze[x][y]==1:
                            maze[x][y]=0
                            dq.append((x,y))
                            count+=1
            count_arr.append(count)
            count=0

print(len(count_arr))
for i in sorted(count_arr):
    print(i,end=' ')

