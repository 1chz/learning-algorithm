# 파이프 옮기기 1
n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]

# 가로 세로 대각선 idx를 0, 1, 2 로 설정
table = [[[0]*3 for _ in range(n)] for _ in range(n)]
table[0][1][0] = 1

for x in range(2, n):
    if board[0][x] == 0:
        table[0][x][0] = table[0][x-1][0]

for y in range(n):
    for x in range(2, n):
        # 대각선 이동
        if board[y][x] == board[y][x-1] == board[y-1][x] == 0:
            table[y][x][2] = sum(table[y-1][x-1])
        # 다음 칸으로 이동
        if board[y][x] == 0:
            # 가로
            table[y][x][0] = table[y][x-1][2] + table[y][x-1][0]
            # 세로
            table[y][x][1] = table[y-1][x][2] + table[y-1][x][1]

print(sum(table[-1][-1]))