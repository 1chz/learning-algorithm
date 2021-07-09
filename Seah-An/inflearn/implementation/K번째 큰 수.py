import sys
sys.stdin=open("in1.txt","rt")

N, K = map(int, input().split())

arr = list(map(int,input().split()))

count = 0
res = set()
for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1, N):
            res.add(arr[i] + arr[j] + arr[k])

res = list(res)
res.sort(reverse=True)
print(res[K-1])