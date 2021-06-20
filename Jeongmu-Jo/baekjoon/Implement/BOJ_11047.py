N, K = map(int, input().split())
value_list = []
for _ in range(N):
    value = int(input())
    if value <= K:
        value_list.append(value)
cnt = 0 
for i in range(len(value_list)):
    value = value_list[(len(value_list))-i-1]
    cnt += (K // value)
    K = K%value   
print(cnt)

#feat(Jeongmu-Jo): [BOJ, 11047] 동전 0

