import sys

n=int(sys.stdin.readline())
bri=int(sys.stdin.readline())

nod_nod=[[0 for i in range(n+1)] for i in range(n+1)]

for i in range(bri):
    n_1,n_2=map(int,sys.stdin.readline().replace("\n",'').split())
    nod_nod[n_1][n_2]=1
    nod_nod[n_2][n_1]=1

dq=[]
visited=[False]*(n+1)
count=0
def bfs(i):
    visited[i]=True
    for index,value in enumerate(nod_nod[i]):
        if value ==1 and visited[index]==False:
            dq.append(index)
            visited[index]=True

    if dq:
        bfs(dq.pop())
    else:
        return

bfs(1)

for i in visited:
    if i == True:
        count+=1

print(count-1)
