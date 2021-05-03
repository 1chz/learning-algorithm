import sys
from collections import deque
import copy

N=int(sys.stdin.readline())

rgb=[[0 for i in range(N)]for i in range(N)]

rgb_x=[[0 for i in range(N)]for i in range(N)] #적록색약 꺼

dx=[1,-1,0,0]
dy=[0,0,1,-1]

for i in range(N):
    rgb[i]=list(sys.stdin.readline().replace("\n",''))

rgb_x=copy.deepcopy(rgb)

for i in range(N):
    for j in range(N):
        if rgb_x[i][j]=='G':
            rgb_x[i][j]='R'

def seper(let,arr,x,y):
    dq=deque()
    dq.append((x,y))
    while dq:
        x,y=dq.popleft()
        arr[y][x]=0
        for i in range(4):
            x_1=x+dx[i]
            y_1=y+dy[i]
            if 0<=x_1<N and 0<=y_1<N and arr[y_1][x_1] == let:
                dq.append((x_1,y_1))
                arr[y_1][x_1]=0



count=0
count_x=0
for i in range(N):
    for j in range(N):
        if rgb[i][j]=='R':
            seper('R',rgb,j,i)
            count+=1
        elif rgb[i][j]=='G':
            seper('G', rgb, j, i)
            count += 1
        elif rgb[i][j]=='B':
            seper('B', rgb, j, i)
            count += 1

for i in range(N):
    for j in range(N):
        if rgb_x[i][j]=='R':
            seper('R',rgb_x,j,i)
            count_x +=1
        elif rgb_x[i][j]=='B':
            seper('B', rgb_x, j, i)
            count_x += 1

print(count,count_x,sep=' ')