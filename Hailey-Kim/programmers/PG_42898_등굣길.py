'''
Way To School

Find the number of the shortest paths
from the house (1,1) to the school (N, N)
while you cannot cross puddles.

m = number of columns, n = number of rows, puddles = coordinates of puddles


programmers.co.kr/learn/courses/30/lessons/42898

03/12/21
'''

def solution(m, n, puddles):
    # initialization
    paths = [[0] * m for _ in range(n)]

    # count # of possible paths to reach each coord
    for i in range(n):
        for j in range(m):
            if (i, j) == (0, 0):
                paths[i][j] = 1
            elif [j+1, i+1] in puddles:
                paths[i][j] = 0
            else:
                paths[i][j] = paths[i-1][j]+paths[i][j-1]

    return paths[n-1][m-1] % 1000000007