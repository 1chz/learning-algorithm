import sys


N,K=map(int,sys.stdin.readline().split())

arr=list(map(int,sys.stdin.readline().split()))

count=0

def check(arr,plug):
    temp=[]
    go=[]
    global count
    for i in arr: #앞으로의 행동
        if i in plug and (not i in temp): #최대한 빼면 안되는거
            temp.append(i)

        if len(temp) == N:  # 플러그 갯수만큼 가득 찼을 때 미리 조작
            plug.remove(temp[-1])  # 제일 나중에 쓸 물건 빼기
            count += 1
            plug.append(arr[0])
            return




    #여기 왔다는거는 현재 꽂혀 있는 플러그중 앞으로 나오는거 다 제외하고 아무거나 한개 뽑아야된다는 말
    for i in plug:
        if i in temp:
            continue
        else:
            plug.remove(i)
            plug.append(arr[0])
            count+=1
            return

plug=[]
for i in range(K):
    if len(plug)<N and not (arr[i] in plug):
        plug.append(arr[i])
    elif arr[i] in plug:
        continue
    else:
        check(arr[i:],plug)





print(count)

