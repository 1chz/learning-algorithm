N, M = map(int, input().split())
list_num = list(map(int, input().split()))
print(N, M)
print(list_num)

result = 0
length = len(list_num)

for i in range(0, length):
    for j in range(i+1, length):
        for k in range(j+1, length):
            sum_value = list_num[i] + list_num[j] + list_num[k]
            if sum_value <= M:
                result = max(result, sum_value)
print(result)

#feat(Jeongmu-Jo): [BOJ, 11047] 동전 0