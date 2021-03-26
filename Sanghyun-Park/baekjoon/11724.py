import sys
from collections import deque


nod,bri=map(int,sys.stdin.readline().replace("\n",'').split())

nod_nod=[[0 for i in range(nod+1)] for i in range(nod+1)]

for i in range(bri):
    a,b=map(int,sys.stdin.readline().replace("\n",'').split())
    nod_nod[a][b]=1
    nod_nod[b][a] = 1


dq=deque()
visited=[False]*(nod+1)
count=nod

for i in range(nod+1): #nod 는 1번 부터 시작하기 때문
    for j in range(nod+1): # for 문 의미 : 요소 하나에 해당하는 것 다 돌고나서 남은게 있는가 확인
        if nod_nod[i][j]==1 and visited[i]==False:
            dq.append(i)
            visited[i]=True
            while dq:
                nod1=dq.popleft()
                for index,v in enumerate(nod_nod[nod1]):
                    if v == 1 and visited[index]==False:
                        dq.append(index)
                        count-=1
                        visited[index]=True



print(count)
