from collections import deque

nod,bri,st=map(int,input().split())

nod_nod=[[0 for i in range(nod+1)]for i in range(nod+1)]

for i in range(bri):
    n1,n2=map(int,input().split())
    nod_nod[n1][n2]=1
    nod_nod[n2][n1]=1
DFS=[]
BFS=[]
visited=[False]*(nod+1)
visited_1=[False]*(nod+1)

dq=deque()
dq.append(st)
DFS.append(st)
visited[st]=True
while dq:  #DFS
    c_n=dq.pop()
    for i,v in enumerate(nod_nod[c_n]):
        if v==1 and visited[i]==False:
            dq.append(c_n)
            dq.append(i)
            DFS.append(i)
            visited[i]=True
            break
dq_2=deque()
dq_2.append(st)
BFS.append(st)
visited_1[st]=True

while dq_2:  #BFS
    c_n=dq_2.popleft()
    for i,v in enumerate(nod_nod[c_n]):
        if v==1 and visited_1[i]==False:
            dq_2.append(i)
            BFS.append(i)
            visited_1[i] = True

for i in DFS:
    print(i,end=' ')
print()
for i in BFS:
    print(i,end=' ')