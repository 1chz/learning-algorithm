N = int(input())
li = list(map(int, input().split()))
res = []
for i in range(N-1):
    cnt = 0
    for j in range(i+1, N):
        if li[i] > li[j]:
            cnt += 1
        else:
            break
    res.append(cnt)
print(max(res))