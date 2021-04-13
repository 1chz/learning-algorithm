# dev matching

from copy import deepcopy

def rotate(matrix, q, r, c):
    x1, y1, x2, y2 = q
    x1, y1, x2, y2 = x1-1, y1-1, x2-1, y2-1
    x_diff = x2 - x1
    y_diff = y2 - y1
    li = []
    temp_num = 0
    prev_num = 0
    cnt = 0

    for i in range(len(matrix)):
        if i == x1 and cnt < x_diff:
            for j in range(len(matrix[0])):
                if y1 <= j < y2:
                    li.append(matrix[i][j])
                    prev_num = temp_num
                    temp_num = matrix[i][j]
                    matrix[i][j] = prev_num
                cnt += 1
    
    cnt = 0
    for j in range(len(matrix[0])):
        if j == y2 and cnt < y_diff:
            for i in range(len(matrix)):
                if x1 <= i < x2:
                    li.append(matrix[i][j])
                    prev_num = temp_num
                    temp_num = matrix[i][j]
                    matrix[i][j] = prev_num

    cnt = 0
    for i in range(len(matrix), -1, -1):
        if i == x2 and cnt < x_diff:
            for j in range(len(matrix[0]), -1, -1):
                if y1 < j <= y2:
                    li.append(matrix[i][j])
                    prev_num = temp_num
                    temp_num = matrix[i][j]
                    matrix[i][j] = prev_num

    cnt = 0
    for j in range(len(matrix[0])):
        if j == y1 and cnt < y_diff:
            for i in range(len(matrix[0]), -1, -1):
                if x1 < i <= x2:
                    li.append(matrix[i][j])
                    prev_num = temp_num
                    temp_num = matrix[i][j]
                    matrix[i][j] = prev_num

    matrix[x1][y1] = temp_num
    li.append(matrix[x1][y1])

    for i in range(len(matrix)):
        print(matrix[i])
    print("##################")

    return min(li), matrix    


def solution(rows, columns, queries):
    answer = []
    matrix = [[0]*columns for _ in range(rows)]
    for i in range(rows):
        for j in range(columns):
            matrix[i][j] = j + (rows*i) + 1

    for q in queries:
        ret, matrix = rotate(matrix, q, rows, columns)
        answer.append(ret)
    return answer

rows, columns, queries = 100, 100, 	[[2,5,6,6]]
print(solution(rows, columns, queries))



#1
# from itertools import permutations

# def check(n):
#     order = [6,6,5,4,3,2,1]
#     return order[n]
# def solution(lottos, win_nums):
#     answer = []
#     win_nums_permutation = permutations(win_nums, 6)
#     cnt_win_nums = cnt_zero = cnt_lose_nums = 0
#     for i in lottos:
#         if i in win_nums:
#             cnt_win_nums += 1
#         elif i == 0:
#             cnt_zero += 1
#         else:
#             cnt_lose_nums += 1
    
#     answer.append(check(cnt_win_nums + cnt_zero))
#     answer.append(check(cnt_win_nums))
#     return answer
                
# lottos = [44, 1, 0, 0, 31, 25]
# win_nums = [31, 10, 45, 1, 6, 19]
# print(solution(lottos, win_nums))