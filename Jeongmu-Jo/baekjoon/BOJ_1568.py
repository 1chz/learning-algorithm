N = int(input())
cnt = 0
k = 1

while N != 0:
    if N < k:
        k = 1
    N -= k
    k += 1
    cnt += 1

print(cnt)
#feat(Jeongmu-Jo): [BOJ, 1568] 새