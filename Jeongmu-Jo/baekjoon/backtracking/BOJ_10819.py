from itertools import permutations

n = int(input())
arr = list(map(int, input().split()))
nPr = list(permutations(arr))
ans = 0
for i in nPr:
    sum = 0
    for j in range(n-1):
        sum += abs(i[j] - i[j+1])
        ans = max(sum, ans)
print(ans)
#feat(Jeongmu-Jo): [BOJ, 10819] 차이를 최대로
