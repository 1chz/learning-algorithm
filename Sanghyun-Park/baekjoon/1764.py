import sys

N,M=map(int,sys.stdin.readline().split())

people={}
arr=[]
for i in range(N):
    wd=sys.stdin.readline().rstrip()
    people[wd]=True


for i in range(M):
    wd = sys.stdin.readline().rstrip()
    if wd in people.keys():
        arr.append(wd)



arr.sort()
arr.insert(0,len(arr))
for i in arr:
    print(i)


