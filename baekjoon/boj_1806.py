# 부분합
n, s = map(int, input().split())
li = list(map(int, input().split()))

sum_li = [0] * (n+1)
for i in range(1, n+1):
    sum_li[i] = sum_li[i-1] + li[i-1]

answer = 100001
start = 0
end = 1
while start != n:
    if sum_li[end] - sum_li[start] >= s:
        if end - start < answer:
            answer = end - start
        start += 1
    else:
        if end != n:
            end += 1
        else:
            start += 1

if answer != 100001:
    print(answer)
else:
    print(0)