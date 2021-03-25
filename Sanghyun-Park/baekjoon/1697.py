import sys
from collections import deque

sis_l,bro_l=map(int,sys.stdin.readline().replace("\n",'').split())

arr=[0]*(100001)

visited=[False]*(100001)

bfs=deque()


count=0
if sis_l == bro_l:
    print(0)
    exit(0)

bfs.append([sis_l,count])
while bfs:
    sis_l,count=bfs.popleft()
    if sis_l-1>=0 and visited[sis_l-1]==False:
        arr[sis_l-1]=count+1
        bfs.append([sis_l-1,count+1])
        visited[sis_l-1]=True
    if sis_l+1<=100000 and visited[sis_l+1]==False:
        arr[sis_l +1] = count + 1
        bfs.append([sis_l+1,count+1])
        visited[sis_l+1] = True
    if sis_l*2<=100000 and visited[sis_l*2]==False:
        arr[sis_l * 2] = count + 1
        bfs.append([sis_l*2,count+1])
        visited[sis_l*2] = True
        count+=1

print(arr[bro_l])


