from collections import deque

y,x=map(int,input().split())

maze=[list(map(int,input()))for i in range(y)] #미로 원본
been=[[0 for i in range(x)]for i in range(y)] #방문 여부
dis=[[False for i in range(x)]for i in range(y)] #위치 당 최단거리

dx=[1,-1,0,0]
dy=[0,0,1,-1]
#maze(y,x)
#1111   ------->x[y][x]
#1111
dq=deque()
dq.append([0,0])
#(0,1)동,(0,-1)서(1,0)남(-1,0)북
while dq:


    c_x, c_y = dq.popleft()
    for i in range(4):
        n_x,n_y=c_x+dx[i],c_y+dy[i]
        if 0<=n_x<x and 0<=n_y<y and maze[n_y][n_x] ==1:
            if been[n_y][n_x] ==False:
                dq.append([n_x,n_y])
                dis[n_y][n_x]=dis[c_y][c_x]+1
                been[n_y][n_x]=True

#왜 위치당 최단거리가 되는가?
#같은 거리를 갔을 때 갈 수 있는 모든 경우의 수를 파악하고 그 때의 방문 여부를 저장하기때문에
#같은 곳을 가더라도 이미 방문 했다는것은 더 짧은 거리내에서 그 지점을 방문할 수 있다는 말이 되므로

print(dis[y-1][x-1]+1)