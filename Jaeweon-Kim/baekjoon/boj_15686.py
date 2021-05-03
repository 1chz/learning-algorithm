# 치킨 배달

from itertools import combinations

N, M = map(int, input().split())
chicken, house = [], []

for i in range(N):
    data = list(map(int, input().split()))
    for j in range(N):
        if data[j] == 1:
            house.append((i,j))
        if data[j] == 2:
            chicken.append((i,j))

def find_min(candidate):
    answer = 0
    for hx, hy in house:
        result = 1e9
        for cx, cy in candidate:
            result = min(result, abs(hx - cx) + abs(hy - cy))
        answer += result
    return answer

candidates = list(combinations(chicken, M))
min_value = 1e9
for candidate in candidates:
    min_value = min(min_value, find_min(candidate))

print(min_value)