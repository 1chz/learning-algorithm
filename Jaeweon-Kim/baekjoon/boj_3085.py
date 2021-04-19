# 사탕 게임

def check(board):
    cnt = 0
    for i in range(n):
        cnt_row = 1
        cnt_col = 1
        for j in range(n-1):
            if board[i][j] == board[i][j+1]:
                cnt_row += 1
            else:
                cnt = max(cnt, cnt_row)
                cnt_row = 1
            
            if board[j][i] == board[j+1][i]:
                cnt_col += 1
            else:
                cnt = max(cnt, cnt_col)
                cnt_col = 1
        cnt = max(cnt, cnt_row, cnt_col)
    return cnt

n = int(input())
board = [list(map(str, input())) for _ in range(n)]
res = 0

for i in range(n):
    for j in range(n-1):
        if board[i][j] != board[i][j+1]:
            tmp = board[i][j]
            board[i][j] = board[i][j+1]
            board[i][j+1] = tmp

            res = max(res, check(board))

            tmp = board[i][j]
            board[i][j] = board[i][j+1]
            board[i][j+1] = tmp

        if board[j][i] != board[j+1][i]:
            tmp = board[j][i]
            board[j][i] = board[j+1][i]
            board[j+1][i] = tmp

            res = max(res, check(board))

            tmp = board[j][i]
            board[j][i] = board[j+1][i]
            board[j+1][i] = tmp
print(res)