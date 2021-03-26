import sys
from collections import deque

tc=int(sys.stdin.readline())

dx=[1,-1,0,0]
dy=[0,0,1,-1]


for i in range(tc):
    M,N,K=map(int,sys.stdin.readline().replace("\n",'').split())
    cab=[[0 for i in range(M)]for i in range(N)]
    visited=[[False for i in range(M)]for i in range(N)]
    dq=deque()
    count=0
    for i in range(K):
        a,b=map(int,sys.stdin.readline().replace("\n",'').split())
        cab[b][a]=1

    for j in range(N):
        for k in range(M):
            if cab[j][k]==1:
                visited[j][k]= True
                cab[j][k]=0
                dq.append((k,j))
                while dq:
                    x,y=dq.popleft()
                    for z in range(4):
                        if 0<=y+dy[z]<=N-1 and 0<=x+dx[z]<=M-1 and cab[y+dy[z]][x+dx[z]] ==1 and visited[y+dy[z]][x+dx[z]]==False:
                            dq.append((x+dx[z],y+dy[z]))
                            visited[y+dy[z]][x+dx[z]]=True
                            cab[y+dy[z]][x+dx[z]]=0
                count+=1
    print(count)



