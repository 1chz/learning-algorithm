import sys
from collections import deque


dq=deque()

M,N=map(int,sys.stdin.readline().split())

tomato=[[1 for i in range(N)]for i in range(M)]

dx=[1,-1,0,0]
dy=[0,0,1,-1]


count=0
count_arr=[]
visited=[[False for i in range(N)]for i in range(M)]

for i in range(N):
    temp=list(map(int,sys.stdin.readline().split()))
    for j in range(M):
        tomato[j][i]=temp[j]


count_p=0
count_c=0
day=0

for i in range(M): #X
    for j in range(N): #Y
        if tomato[i][j]==1:
            count_p+=1
            dq.append((i, j))
            visited[i][j] = True

while dq: #영역 전부 지우기
    for i in range(count_p):
        c_x,c_y=dq.popleft()
        for k in range(4):
            x=c_x+dx[k]
            y=c_y+dy[k]
            if 0<=x<M and 0<=y<N:
                if tomato[x][y]!=-1 and visited[x][y]==False: #-1만 아니면 방문
                    tomato[x][y]=1
                    dq.append((x,y))
                    visited[x][y] =True
                    count_c+=1
    if count_c!=0:
        day+=1
        count_p=count_c
        count_c=0



for i in range(M): #X
    for j in range(N): #Y
        if tomato[i][j]==0:
            print(-1)
            exit()
print(day)
