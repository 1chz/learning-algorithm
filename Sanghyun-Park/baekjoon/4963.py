import sys
from collections import deque

dx=[1,-1,0,0,1,-1,1,-1]
dy=[0,0,1,-1,1,1,-1,-1]




while 1:
    w,h=map(int,sys.stdin.readline().split())
    dq=deque()
    count = 0

    if w==0 and h==0:
        exit()
    else:
        map_1=[[0 for i in range(w)] for i in range(h)]
        for i in range(h):
            map_1[i]=list((map(int,sys.stdin.readline().split())))

        ##### 맵 활성화

        for j in range(h):  #map작업
            for k in range(w):
                if map_1[j][k]==1:
                    map_1[j][k]=0
                    dq.append((j,k)) #y,x 푸쉬

                    while dq:
                        y,x=dq.popleft()
                        for i in range(8):
                            x_1=x+dx[i]
                            y_1=y+dy[i]

                            if 0<=x_1<w and 0<=y_1<h:
                                if map_1[y_1][x_1]==1:
                                    dq.append((y_1,x_1))
                                    map_1[y_1][x_1]=0
                    count+=1

        print(count)

