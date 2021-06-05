N, M = map(int, input().split())
castle = [input() for _ in range(N)]
cnt = 0

row = [0] * N
col = [0] * M

for i in range(N):
    for j in range(M):
        # 00 , 01, 02
        if castle[i][j] == 'X':
            row[i] = 1
            col[j] = 1

row_count = 0
for i in range(N):
    if row[i] == 0:
        row_count += 1

col_count = 0 
for j in range(M):
    if col[j] == 0:
        col_count += 1
        
print(max(row_count,col_count))
#feat(Jeongmu-Jo): [BOJ, 1236] 성 지키기