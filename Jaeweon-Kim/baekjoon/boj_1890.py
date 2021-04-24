# 점프

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]
table = [[0] * n for _ in range(n)]
table[0][0] = 1

for i in range(n):
    for j in range(n):
        if table[i][j] != 0 and graph[i][j] != 0:
            if i + graph[i][j] < n:
                table[i + graph[i][j]][j] += table[i][j]
            if j + graph[i][j] < n:
                table[i][j + graph[i][j]] += table[i][j]
print(table[-1][-1])