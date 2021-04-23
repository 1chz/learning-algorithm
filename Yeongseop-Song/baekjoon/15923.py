# boj 15923 욱제는 건축왕이야!! b3
# noj.am/15923

N = int(input())
coordinate = [list(map(int, input().split())) for _ in range(N)]
coordinate += coordinate
ans = 0

for i in range(N):
    if coordinate[i][0] == coordinate[i + 1][0]:
        ans += abs(coordinate[i + 1][1] - coordinate[i][1])
    if coordinate[i][1] == coordinate[i + 1][1]:
        ans += abs(coordinate[i + 1][0] - coordinate[i][0])

print(ans)
