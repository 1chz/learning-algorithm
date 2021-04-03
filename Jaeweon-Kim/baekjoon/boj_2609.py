# 최대공약수와 최소공배수
n = int(input())
arr = list(map(int, input().split()))
res = 0

if len(arr) == n:
    for i in arr:
        cnt = 0
        for j in range(1, i+1):
            if i % j == 0:
                cnt += 1
        if cnt == 2:
            res += 1
print(res)