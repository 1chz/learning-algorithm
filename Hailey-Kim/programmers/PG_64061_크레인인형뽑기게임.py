"""
크레인 인형뽑기 게임
https://programmers.co.kr/learn/courses/30/lessons/64061
06/21/2021
"""
def solution(board, moves):
    answer = 0
    stack = []
    for x in moves:
        toRemove = getFirstElementInColAndRemove(x, board)
        if stack and stack[-1] == toRemove:
            answer+= 2
            stack.pop()
        else:
            if toRemove > 0:
                stack.append(toRemove)
    return answer

def getFirstElementInColAndRemove(move, board):
    toRemove = -1
    for i in range(len(board)):
        if board[i][move - 1] != 0:
            toRemove = board[i][move - 1]
            board[i][move -1]=0
            break
            
    return toRemove