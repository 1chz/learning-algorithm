def solution(triangle):
    h = len(triangle)
    for i in range(1, h):
        for j, x in enumerate(triangle[i]):
            if j == 0:
                triangle[i][j] = max(triangle[i-1][:j+1])+x
            else:
                triangle[i][j] = max(triangle[i-1][j-1:j+1]) + x
            
    return max(triangle[-1])