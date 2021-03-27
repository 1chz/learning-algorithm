import sys

n=int(sys.stdin.readline())

apart=[]


for i in range(n):
    apart.append(list(map(int,list(sys.stdin.readline().replace("\n",'')))))

dx=[1,-1,0,0] #미로 이동할 때 필수
dy=[0,0,1,-1]

apart_num=1
res=[]

dq=[]


for i,v in enumerate(apart):  #BFS
    for j,v_2 in enumerate(v):
        if apart[i][j]==1: #단지 종류 구별
            apart[i][j]=0  # 방문 했다
            dq.append((i, j))
            while dq: #같은 종류의 단지판별
                y,x=dq.pop()
                for k in range(4):  #미로 포인트
                    c_x=x+dx[k]
                    c_y=y+dy[k]
                    if 0<=c_x<n and 0<=c_y<n and apart[c_y][c_x]==1:
                        apart[c_y][c_x]=0
                        dq.append((c_y,c_x))
                        apart_num += 1
            res.append(apart_num)
            apart_num = 1



print(len(res))
for i in sorted(res):
    print(i)