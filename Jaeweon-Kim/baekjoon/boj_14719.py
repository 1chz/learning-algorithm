# 빗물
h, w = map(int, input().split())
walls = list(map(int, input().split()))
answer = 0
for i in range(len(walls)):
    max_left = max(walls[:i+1])
    max_right = max(walls[i:])
    lower_max = min(max_left, max_right)
    answer += abs(walls[i] - lower_max)
print(answer)